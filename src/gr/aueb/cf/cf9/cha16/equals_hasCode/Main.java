package gr.aueb.cf.cf9.cha16.equals_hasCode;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(4,4);
        Point p2 = new Point(4,4);

        System.out.println(p1.equals(p2));
    }


}
