package gr.aueb.cf.cf9.cha7;

/**
 *
 *
 */
public class StrHelper {

    public static void main(String[] args) {
        String str = "Athens";
        String str1 = "athens";
        String str2 ="ATHENS";
        String str4 = new String("Athens");
        String str5 = "Athens";

        //Equals
        boolean equals1 = str1 == str; //
        boolean equals2 = str1 == str4;
        boolean equals3 = str == str5;

        boolean equal4 = str1.equals(str);
        boolean equal5 = str.equals(str5);
        boolean equal6= str1.equals(str2);

        boolean equal7 = str.equalsIgnoreCase(str4);

        // Compare
        if (str1.compareTo(str2) > 0) {
            System.out.println("str1 > str2");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println("str1 < str2");
        } else {    // str1.compareTo(str2) == 0
            System.out.println("str1 == str2");
        }

        if (str1.compareToIgnoreCase(str2) > 0) {
            System.out.println("str1 > str2");
        } else if (str1.compareToIgnoreCase(str2) < 0) {
            System.out.println("str1 < str2");
        } else {    // str1.compareToIgnoreCase(str2) == 0
            System.out.println("str1 == str2");
        }
            
        }


    }

