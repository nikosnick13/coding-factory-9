package gr.aueb.cf.cf9.cha7;

/**
 * Παλινδρομική είναι μία πρόταση (string) που διαβάζεται
 * το ίδιο από την αρχή και το τέλος.
 */
public class Palindrome {

    public static void main(String[] args) {




    }

    public static boolean isPalidrome(String str){

        for(int i = 0,j = str.length() -1 ; i < j; i++, j--){

            if(str.charAt(i) != str.charAt(j))     return false;
        }
        return true;
    }

    public static boolean isPalidrome2(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
