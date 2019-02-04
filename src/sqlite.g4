grammar sqlite;

parse
 : ( sql_stmt semicolon_symbol | error )* EOF
 ;

error
 : UNEXPECTED_CHAR
   {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   }
 ;

sql_stmt
  :  compound_select_stmt
   | drop_table_stmt
   | factored_select_stmt
   | simple_select_stmt
   | select_stmt
  ;

compound_select_stmt
 : (K_WITH common_table_expression ( comma_symbol common_table_expression )* )?
   select_core ( ( K_UNION K_ALL? | K_INTERSECT | K_EXCEPT ) select_core )+
   ( K_ORDER K_BY ordering_term ( comma_symbol ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | comma_symbol) expr )? )?
 ;

drop_table_stmt
 : K_DROP K_TABLE ( K_IF K_EXISTS )? ( database_name dot_symbol )? table_name #dropTable
 ;

factored_select_stmt
 : (K_WITH common_table_expression ( comma_symbol common_table_expression )* )?
   select_core ( compound_operator select_core )*
   ( K_ORDER K_BY ordering_term ( comma_symbol ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | comma_symbol ) expr )? )? #factoredSelectStatement
 ;

simple_select_stmt
 : (K_WITH common_table_expression ( comma_symbol common_table_expression )* )?
   select_core ( K_ORDER K_BY ordering_term ( comma_symbol ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | comma_symbol ) expr )? )? #simpleSelectStatement
 ;

select_stmt
 : (K_WITH common_table_expression ( comma_symbol common_table_expression )* )?
   select_or_values ( compound_operator select_or_values )*
   ( K_ORDER K_BY ordering_term ( comma_symbol ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | comma_symbol ) expr )? )? #selectStatement
 ;

select_or_values
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( comma_symbol result_column )*
   ( K_FROM ( table_or_subquery ( comma_symbol table_or_subquery )* | join_clause ) )?
   ( K_WHERE expr )?
   ( K_GROUP K_BY expr ( comma_symbol expr )* ( K_HAVING expr )? )?  #selectOrValues
 //| K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;

 type_name
 : name
 | name_with_brackets + ( open_paren signed_number close_paren
                       | open_paren signed_number comma_symbol signed_number close_paren )?
 ;

expr
 : literal_value #myExpression
 //| BIND_PARAMETER
 | ( ( database_name dot_symbol )? table_name dot_symbol )? column_name #myExpression
 | unary_operator expr #none1
 | expr PIPE2 expr  #myExpression
 | expr ( STAR |DIV |MOD ) expr #myExpression ///
 | expr ( PLUS |MINUS ) expr #myExpression
 | expr ( LT2 | GT2 | AMP | PIPE ) expr #myExpression
 | expr ( LT | LT_EQ | GT | GT_EQ ) expr #myExpression
 | expr ( assign_symbol | EQ | NOT_EQ1 | NOT_EQ2 | K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB ) expr #myExpression
 | expr K_AND expr #myExpression
 | expr K_OR expr #myExpression
// | function_name OPEN_PAR ( K_DISTINCT? expr ( COMMA expr )* | STAR )? CLOSE_PAR #myExpression
 | open_paren expr close_paren #myExpression
 | K_CAST open_paren expr K_AS type_name close_paren #myExpression
 | expr K_NOT? ( K_LIKE | K_GLOB) expr #myExpression
 | expr ( K_ISNULL | K_NOTNULL | K_NOT K_NULL ) #myExpression
 | expr K_IS K_NOT? expr #myExpression
 | expr K_NOT? K_BETWEEN expr K_AND expr #myExpression
 | expr K_NOT? K_IN ( open_paren ( select_stmt
                          | expr ( comma_symbol expr )*
                          )?
                      close_paren
                    | ( database_name dot_symbol )? table_name ) #myExpression
 | ( ( K_NOT )? K_EXISTS )? open_paren select_stmt close_paren #myExpression
 | K_CASE expr? ( K_WHEN expr K_THEN expr )+ ( K_ELSE expr )? K_END #myExpression
 ;

ordering_term
 : expr ( K_ASC | K_DESC )? #orderingTerm
 ;

common_table_expression
 : table_name ( open_paren column_name ( comma_symbol column_name )* close_paren )? K_AS open_paren select_stmt close_paren #commonTableExpression
 ;

result_column
 : STAR #myStar
 | table_name dot_symbol STAR #mystart
 | expr ( K_AS? column_alias )?  #expressionAlias
 ;

table_or_subquery
 : ( database_name dot_symbol )? table_name ( K_AS? table_alias )?  #tableORSubqueryA
 | open_paren ( table_or_subquery ( comma_symbol table_or_subquery )*
       | join_clause )
   close_paren ( K_AS? table_alias )? #tableORSubqueryA
 | open_paren select_stmt close_paren ( K_AS? table_alias )? #tableORSubqueryA
 ;

join_clause
 : table_or_subquery ( join_operator table_or_subquery join_constraint )*
 ;

join_operator
 : comma_symbol #none
 | K_NATURAL? ( K_LEFT K_OUTER? | K_INNER | K_CROSS )? K_JOIN #joinOperator
 ;

join_constraint
 : ( K_ON expr
   | K_USING open_paren column_name ( comma_symbol column_name )* close_paren )? #joinConstraint
 ;

select_core
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( comma_symbol result_column )*
   ( K_FROM ( table_or_subquery ( comma_symbol table_or_subquery )* | join_clause ) )?
   ( K_WHERE expr )?
   ( K_GROUP K_BY expr ( comma_symbol expr )* ( K_HAVING expr )? )? #selectCore
// | K_VALUES OPEN_PAR expr ( COMMA expr )* CLOSE_PAR ( COMMA OPEN_PAR expr ( COMMA expr )* CLOSE_PAR )*
 ;

compound_operator
 : K_UNION #compoundPperator
 | K_UNION K_ALL #compoundOperator
 | K_INTERSECT #compoundOperator
 | K_EXCEPT #compoundOperator
 ;

signed_number
 : ( PLUS | MINUS )? NUMERIC_LITERAL #signedNumber
 ;

literal_value
 : NUMERIC_LITERAL #literalValue
 | STRING_LITERAL #literalValue
 | BLOB_LITERAL #literalValue
 | K_NULL       #literalValue
 | K_CURRENT_TIME #literalValue
 | K_CURRENT_DATE #literalValue
 | K_CURRENT_TIMESTAMP #literalValue
 ;

unary_operator
 : MINUS  #unaryOperator
 | PLUS   #unaryOperator
 | TILDE  #unaryOperator
 | K_NOT  #unaryOperator
 ;

column_alias
 : IDENTIFIER #columnAlias
 | STRING_LITERAL #columnAlias
 ;

dot_symbol
: DOT #getDot;

comma_symbol
: COMMA #getComma;

semicolon_symbol
: SCOL #getSCOL;

open_paren
: OPEN_PAR #getOpenPar
;

close_paren
: CLOSE_PAR #getClosePar
;

assign_symbol
: ASSIGN #getAssign
;


keyword
 : K_ADD
 | K_ALL
 | K_ALTER
 | K_AND
 | K_AS
 | K_ASC
 | K_AUTOINCREMENT
 | K_BETWEEN
 | K_BY
 | K_CASE
 | K_CAST
 | K_COLUMN
 | K_CREATE
 | K_CROSS
 | K_CURRENT_DATE
 | K_CURRENT_TIME
 | K_CURRENT_TIMESTAMP
 | K_DATABASE
 | K_DEFAULT
 | K_DELETE
 | K_DESC
 | K_DISTINCT
 | K_DROP
 | K_ELSE
 | K_END
 | K_EXCEPT
 | K_EXISTS
 | K_FOR
 | K_FOREIGN
 | K_FROM
 | K_FULL
 | K_GLOB
 | K_GROUP
 | K_HAVING
 | K_IF
 | K_IN
 | K_INNER
 | K_INSERT
 | K_INTERSECT
 | K_INTO
 | K_IS
 | K_ISNULL
 | K_JOIN
 | K_KEY
 | K_LEFT
 | K_LIKE
 | K_LIMIT
 | K_NATURAL
 | K_NO
 | K_NOT
 | K_NOTNULL
 | K_NULL
 | K_OF
 | K_OFFSET
 | K_ON
 | K_OR
 | K_ORDER
 | K_OUTER
 | K_PRIMARY
 | K_REFERENCES
 | K_RENAME
 | K_REPLACE
 | K_RIGHT
 | K_ROW
 | K_SELECT
 | K_SET
 | K_TABLE
 | K_THEN
 | K_TO
 | K_UNION
 | K_UNIQUE
 | K_UPDATE
 | K_USING
 | K_VALUES
 | K_VIEW
 | K_WHEN
 | K_WHERE
 | K_WITH
 ;

// TODO check all names below

name
 :( INT
  | INTEGER
  | TINYINT
  | SMALLINT
  | MEDIUMINT
  | BIGINT
  | UNSIGNED BIG INT
  | TEXT
  | BLOB
  | REAL
  | DOUBLE
  | FLOAT
  | NUMERIC
  | BOOLEAN
  | DATE
  | DATETIME ) #typeName
 ;


name_with_brackets
 : ( CHARACTER
   | VARCHAR
   | NCHAR
   | NVARCHAR
   | DECIMAL ) #typeNameWithBrackets
;
/*
function_name
 : any_name
 ;*/

database_name
 : any_name #getDatabaseName
  ;

table_name
 : any_name #getTableName
 ;

column_name
 : any_name #getColumnName
 ;

table_alias
 : any_name #getTableAlias
 ;



any_name
 : IDENTIFIER #identifier
 | keyword    #keyWordL
 | STRING_LITERAL  #stringLiteral
 | OPEN_PAR any_name CLOSE_PAR #reAnyName // no implementation for this one but I dont know.
 ;

SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
CLOSE_PAR : ')';
COMMA : ',';
ASSIGN : '=';
STAR : '*';
PLUS : '+';
MINUS : '-';
TILDE : '~';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';
UNDERSCORE : '_';


// http://www.sqlite.org/lang_keywords.html
K_ADD : A D D;
K_ALL : A L L;
K_ALTER : A L T E R;
K_AND : A N D;
K_AS : A S;
K_ASC : A S C;
K_AUTOINCREMENT : A U T O I N C R E M E N T;
K_BETWEEN : B E T W E E N;
K_BY : B Y;
K_CASE : C A S E;
K_CAST : C A S T;
K_COLUMN : C O L U M N;
K_CREATE : C R E A T E;
K_CROSS : C R O S S;
K_CURRENT_DATE : C U R R E N T UNDERSCORE D A T E;
K_CURRENT_TIME : C U R R E N T UNDERSCORE T I M E;
K_CURRENT_TIMESTAMP : C U R R E N T UNDERSCORE T I M E S T A M P;///
K_DATABASE : D A T A B A S E;
K_DEFAULT : D E F A U L T;
K_DELETE : D E L E T E;
K_DESC : D E S C;
K_DISTINCT : D I S T I N C T;
K_DROP : D R O P;
K_ELSE : E L S E;
K_END : E N D;
K_EXCEPT : E X C E P T;
K_EXISTS : E X I S T S;
K_FOR : F O R;
K_FOREIGN : F O R E I G N;
K_FROM : F R O M;
K_FULL : F U L L;
K_GLOB : G L O B;
K_GROUP : G R O U P;
K_HAVING : H A V I N G;
K_IF : I F;
K_IN : I N;
K_INNER : I N N E R;
K_INSERT : I N S E R T;
K_INTERSECT : I N T E R S E C T;
K_INTO : I N T O;
K_IS : I S;
K_ISNULL : I S N U L L;
K_JOIN : J O I N;
K_KEY : K E Y;
K_LEFT : L E F T;
K_LIKE : L I K E;
K_LIMIT : L I M I T;
K_NATURAL : N A T U R A L;
K_NO : N O;
K_NOT : N O T;
K_NOTNULL : N O T N U L L;
K_NULL : N U L L;
K_OF : O F;
K_OFFSET : O F F S E T;
K_ON : O N;
K_OR : O R;
K_ORDER : O R D E R;
K_OUTER : O U T E R;
K_PRIMARY : P R I M A R Y;
K_REFERENCES : R E F E R E N C E S;
K_RENAME : R E N A M E;
K_REPLACE : R E P L A C E;
K_RIGHT : R I G H T;
K_ROW : R O W;
K_SELECT : S E L E C T;
K_SET : S E T;
K_TABLE : T A B L E;
K_THEN : T H E N;
K_TO : T O;
K_UNION : U N I O N;
K_UNIQUE : U N I Q U E;
K_UPDATE : U P D A T E;
K_USING : U S I N G;
K_VALUES : V A L U E S;
K_VIEW : V I E W;
K_WHEN : W H E N;
K_WHERE : W H E R E;
K_WITH : W I T H;


///tuta en ta eho sta keywords/
INT : I N T;
INTEGER : I N T E G E R;
TINYINT : T I N Y I N T;
SMALLINT : S M A L L I N T;
MEDIUMINT : M E D I U M I N T;
BIGINT : B I G I N T;
UNSIGNED : U N S I G N E D;
BIG : B I G;
TEXT : T E X T;
BLOB : B L O B;
REAL : R E A L;
DOUBLE : D O U B L E;
FLOAT : F L O A T;
NUMERIC : N U M E R I C;
BOOLEAN : B O O L E A N;
DATE : D A T E;
DATETIME : D A T E T I M E;

CHARACTER : C H A R A C T E R;
VARCHAR : V A R C H A R;
NCHAR : N C H A R;
NVARCHAR : N V A R C H A R;
DECIMAL : D E C I M A L;

IDENTIFIER
 : '"' (~'"' | '""')* '"'   ////////////////
 | '`' (~'`' | '``')* '`'   //////////////
 | '[' ~']'* ']'            ////////////1
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;

NUMERIC_LITERAL
 : DIGIT+ ( DOT DIGIT* )? ( E [-+]? DIGIT+ )?
 | DOT DIGIT+ ( E [-+]? DIGIT+ )?
 ;

BIND_PARAMETER
 : '?' DIGIT*    ////////////////////
 | [:@$] IDENTIFIER
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

BLOB_LITERAL
 : X STRING_LITERAL
 ;

SINGLE_LINE_COMMENT
 : '--'  ~[\r\n]* -> channel(HIDDEN)
 ;

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];