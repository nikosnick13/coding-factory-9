package gr.aueb.cf.cf9.cha14;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point2D(1,12);
        Point p3 = new Point3D(1.4, 12, 7.1);

        p1.movePlus10();
        p1.movePlus10();

        p2.movePlusOne();
        p3.movePlus10();


        doPrint(p1);


    }
    public static void doMovePlus10(Point p) {
        p.movePlus10();         // late binding
    }

    public static void doPrint(Point p) {
        System.out.println(p);
    }
}
