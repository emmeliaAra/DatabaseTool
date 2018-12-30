import java.util.LinkedList;

public class MyHelper {

    public StringBuilder getFields(LinkedList<String> myList)
    {
        StringBuilder sb = new StringBuilder( 1024 );
        if(myList != null)
        {
            for(int i=0; i<myList.size(); i++)
                sb.append(myList.get(i) +",");
            sb.deleteCharAt(sb.length()-1);
        }
        return sb;
    }

    public StringBuilder getWhereFields(LinkedList<String> myList)
    {
        StringBuilder sb = new StringBuilder( 1024 );
        if(myList != null)
            for(int i=0; i<myList.size(); i++)
                if(myList.get(i).equalsIgnoreCase("."))
                    sb.append(myList.get(i));
                else if(i>0)
                    if(!myList.get(i).equalsIgnoreCase(".") && myList.get(i-1).equalsIgnoreCase("."))
                        sb.append(myList.get(i));
                    else sb.append(" " + myList.get(i));
                else
                    sb.append(" " + myList.get(i));

        return sb;
    }
}
