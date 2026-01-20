package gr.aueb.cf.cf9.cha19;

public class RegEx {
    public static void main(String[] args) {


        String t = "sdada dsasda" ;

        System.out.println(isTwoWords(t));

    }

    public static boolean isHello(String s){
        return s.matches("Hello");
    }

    public static boolean isHelloOrHi(String s){
        return s.matches("Hello|Hi");
    }

    /*
     * Character Classes
     */
    public static boolean isHhello(String s) {
        return s.matches("[Hh]ello");
    }
    /**
     * Ξεκινάει με uppercase και ακολουθείται από τη λέξη coding
     * @param s
     * @return
     */
    public static boolean startsWithUppercase(String s) {
        return s.matches("[A-Z]coding");
    }
    public static boolean startsWithUpperOrLowercase(String s) {
        return s.matches("[A-Za-z]coding");
    }

    public static boolean startsWithLetter(String s) {
        return s.matches("[a-zA-Z0-9_]coding");
    }

    // Μεταχαρακτήρες

    public static boolean anyCharAndDigit(String s) {
        return s.matches(".\\d");   // .[0-9]
    }

    public static boolean dotAndDigit(String s) {
        return s.matches("\\.\\d");
    }


    //  xx/xx/xxxx
    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static boolean isTwoWords(String a){
        return a.matches(".*\\s+.*");
    }

    public static String reverse(String s) {
        return s.replaceAll("(.+)\\s(.+)", "$2 $1" );   // backreference - groups
    }



}
