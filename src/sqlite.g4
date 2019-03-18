grammar sqlite;

parse
 : ( sql_stmt semicolon_symbol | error )* EOF
 ;

error
 : UNEXPECTED_CHAR
    {
        notifyErrorListeners("Unexpected characher found " + $UNEXPECTED_CHAR.text);
    }
 ;

sql_stmt
  :  drop_table_stmt
   | select_core
  ;

drop_table_stmt
 : K_DROP K_TABLE  ( database_name dot_symbol )? table_name #dropTable
 ;

    select_core
     : K_SELECT  result_column ( comma_symbol result_column )*
      ( K_FROM ( table_or_database ( comma_symbol table_or_database )*))?
      ( K_WHERE expr )?                                                  #selectCore
      ;

result_column
 : STAR #myStar
 | table_name dot_symbol STAR #mystart
 | expr  #expressionAlias
 ;

table_or_database
 : ( database_name dot_symbol )? table_name
 | open_paren ( table_or_database ( comma_symbol table_or_database )*) close_paren
 ;

expr
 : literal_value #myExpression
 | ( ( database_name dot_symbol )? table_name dot_symbol )? column_name #myExpression
 | unary_operator expr #none1
 | expr  STAR  expr #myExpression ///
 | expr ( PLUS |MINUS ) expr #myExpression
 | expr ( LT | LT_EQ | GT | GT_EQ ) expr #myExpression
 | expr ( assign_symbol | EQ | NOT_EQ1 | NOT_EQ2 ) expr #myExpression
 | expr K_AND expr #myExpression
 | expr K_OR expr #myExpression
 | open_paren expr close_paren #myExpression
 ;

literal_value
 : NUMERIC_LITERAL #literalValue
 | STRING_LITERAL #literalValue
 ;

unary_operator
 : MINUS  #unaryOperator
 | PLUS   #unaryOperator
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
 : K_AND
 | K_DATABASE
 | K_DROP
 | K_FROM
 | K_OR
 | K_SELECT
 | K_TABLE
 | K_WHERE
 ;

database_name
 : any_name #getDatabaseName
  ;

table_name
 : any_name #getTableName
 ;

column_name
 : any_name #getColumnName
 ;

any_name
 : IDENTIFIER #identifier
 | keyword    #keyWordL
 | STRING_LITERAL  #stringLiteral
 | OPEN_PAR any_name CLOSE_PAR #reAnyName
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
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';


// http://www.sqlite.org/lang_keywords.html
K_AND : A N D;
K_DATABASE : D A T A B A S E;
K_DROP : D R O P;
K_FROM : F R O M;
K_OR : O R;
K_SELECT : S E L E C T;
K_TABLE : T A B L E;
K_WHERE : W H E R E;

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