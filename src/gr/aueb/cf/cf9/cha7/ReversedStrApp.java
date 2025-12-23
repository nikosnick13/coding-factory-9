package gr.aueb.cf.cf9.cha7;

public class ReversedStrApp {

    public static void main(String[] args) {

        String str = "Athems";
        System.out.println( reverse(str));
        System.out.println( reverse2(str));
    }

    public static String reverse(String str){

        StringBuilder reverse = new StringBuilder();

        for (int i = str.length() -1 ; i >= 0; i--){
            reverse.append(str.charAt(i));
        }
        return  reverse.toString();
    }

    public  static String reverse2(String str){
        return  new StringBuilder(str).reverse().toString();
    }
}
