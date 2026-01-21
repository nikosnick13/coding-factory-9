package gr.aueb.cf.cf9.cha19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPass {

    public static void main(String[] args) {

        String pass = "Nikos!123";

        Pattern pattern = Pattern.compile("(?=.*?[!@#$%^&*_+])(?=.*?[A-Z])(?=.*?[1-9])^.{8,}$");
        Matcher matcher = pattern.matcher(pass);

        while (matcher.find()){
            System.out.print( matcher.group());

        }
    }
}
