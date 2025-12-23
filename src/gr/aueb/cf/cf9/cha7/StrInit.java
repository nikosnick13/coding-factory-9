package gr.aueb.cf.cf9.cha7;

/**
 * Δήλωση και αρχικοποιηση (papulate)
 * ενός {@link  String}
 */
public class StrInit {

    public static void main(String[] args) {

        String s = "Athens";
        String s1 = new String("Athens");
        String s3 = "";
        String s4 = null;
        boolean isEmpty;

        // isEmpty = s3.length() == 0;
        isEmpty = s3.isEmpty();

        System.out.println(s);
        System.out.println("Length " + s.length());
        System.out.printf("City %s\n",s );



    }
}
