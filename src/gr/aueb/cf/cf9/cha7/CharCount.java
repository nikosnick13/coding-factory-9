package gr.aueb.cf.cf9.cha7;

public class CharCount {

    public static void main(String[] args) {

        System.out.println(countChar("NIkolakisn -1995"));

    }

    public static int countChar(String str){

        if(str == null) return 0;
        return str.length();
    }
}
