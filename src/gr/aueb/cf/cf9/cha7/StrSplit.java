package gr.aueb.cf.cf9.cha7;

public class StrSplit {

    public static void main(String[] args) {

        String s = " The University of Athens";
        String[] tokens;

        tokens = s.split(" +");
        for( String token : tokens){
            System.out.println(token);
        }
    }
}
