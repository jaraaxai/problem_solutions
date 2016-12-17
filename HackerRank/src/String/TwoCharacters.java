package String;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collector;

import static java.util.stream.Collectors.*;

public class TwoCharacters {
    public String value="";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();

        List<String> uniqueCharList = Stream.of(s)
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());

        if(uniqueCharList.size() ==1)
        {
            System.out.println(0);
        }
        else if(uniqueCharList.size() ==2)
        {
            boolean ok = isOk(s);
            if(ok)
                System.out.println(s.length());
            else
                System.out.println(0);
        }
        else
            delete(uniqueCharList,s);


    }


    public static void delete(List<String> uniqueCharList,String s)
    {
        String a;
        String value ="";
        for(int i=0;i<uniqueCharList.size();i++)
        {

            for(int j=i+1 ; j<uniqueCharList.size(); j++)
            {
                int jk=0;
                a =s;
                for(jk=0; jk<uniqueCharList.size();jk++)
                {
                    if(jk != i && jk != j)
                        a=a.replaceAll(uniqueCharList.get(jk), "");
                }
                boolean ok =isOk(a);
                if(ok)
                {
                    if(a.length() >value.length())
                        value =a;

                }
            }
        }
        System.out.println(value.length());





    }

    public static boolean isOk(String s)
    {

        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i) == s.charAt(i-1))
                return false;
        }

        return true;
    }
}
