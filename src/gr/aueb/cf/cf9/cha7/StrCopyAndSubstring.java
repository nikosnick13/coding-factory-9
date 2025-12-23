package gr.aueb.cf.cf9.cha7;

/**
 * Αντιγραφή Strings γίνεται με
 * αντιγραφή δεικτών γιατί τα Strings
 * είναι immutable.
 */
public class StrCopyAndSubstring {

    public static void main(String[] args) {

        //Copy
        String s1 = "Coding";
        String s2 = s1;

        s2 = "Fctory";

        System.out.println(s1);
        System.out.println(s2);

        //SubString

        String s3 = s1.substring(1);    //oding
        String s4 = s1.substring(1,3); // od
        System.out.println(s4);

        traverse(s2);

    }
    // Traverse char-by-char με substring
    public static void traverse(String s) {

        for (int i = 0; i < s.length(); i++){
            System.out.println( s.substring(i, i + 1) + " ");
        }
    }


}
