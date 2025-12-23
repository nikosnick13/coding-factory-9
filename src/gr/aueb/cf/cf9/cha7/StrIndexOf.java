package gr.aueb.cf.cf9.cha7;

public class StrIndexOf {

    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOfIndex = s.indexOf("o");
        int positionOfIndex1 = s.indexOf("o",2);

        System.out.println(positionOfIndex);
        System.out.println(positionOfIndex1);

        int positionOfLast = s.lastIndexOf("o");  // 11
        System.out.println(positionOfLast);


        System.out.println(getExtension("fileName.txt"));
    }
    public static String getExtension(String s){

      return  s.substring(s.indexOf(".")+ 1) ;
    }

}
