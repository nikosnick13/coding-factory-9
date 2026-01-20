package gr.aueb.cf.cf9.cha19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateMatcher {


    public static void main(String[] args) {
        String s = "06/12/2026 and 11/12/2026";

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");;
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());

            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

//            String grDate = String.format("%s/%s/%s", day, month, year);
            String grDate = day + "/" + month + "/" + year;
            System.out.println(grDate);
            System.out.println();
        }


    }



}
