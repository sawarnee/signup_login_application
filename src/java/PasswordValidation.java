
import java.util.StringTokenizer;

public class PasswordValidation
{
    public String pwdValidate(String a)
    {
        String result = "";
        
        String lc = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String uc = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String num = "1 2 3 4 5 6 7 8 9 0";
        String sc = "! @ # $ % ^ & * ( ) - + / = _ { } [ ] ; : ' ? > < ~ . ,";
        
        int countlc=0, countuc=0, countnum=0, countsc=0;
        
        StringTokenizer st;
        
        st = new StringTokenizer(lc," ");
        while(st.hasMoreTokens())
        {
            if(a.contains(st.nextToken()))
            {
                countlc=1;
            }
        }

        st = new StringTokenizer(uc," ");
        while(st.hasMoreTokens())
        {
            if(a.contains(st.nextToken()))
            {
                countuc=1;
            }
        }

        st = new StringTokenizer(num," ");
        while(st.hasMoreTokens())
        {
            if(a.contains(st.nextToken()))
            {
                countnum=1;
            }
        }

        st = new StringTokenizer(sc," ");
        while(st.hasMoreTokens())
        {
            if(a.contains(st.nextToken()))
            {
                countsc=1;
            }
        }

        if(countlc==1 && countuc==1 && countnum==1 && countsc==1 && a.length()>=8)
        {
            result = "pass";
        }
        else
        {
            result = "fail";
        }
        
        return result;
    }
}
