package gr.aueb.cf.cf9.cha19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LowerCaseAssert {

    public static void main(String[] args) {

        String s = "AAAAAaSA";

        Pattern pattern = Pattern.compile( "(?=.*?[a-z])^.{8}$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            System.out.print( matcher.group());

        }
    }
}
