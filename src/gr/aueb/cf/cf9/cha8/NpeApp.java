package gr.aueb.cf.cf9.cha8;

public class NpeApp {

    public static void main(String[] args) {

        String s;
        s = getOneOrNull();

        if(s == null){
            System.out.println("s in null"); //State is test
            return;
        }

        System.out.println(s.length());
    }

    public static String getOneOrNull(){
        return null;
    }
}
