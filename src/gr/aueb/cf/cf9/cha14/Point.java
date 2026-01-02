package gr.aueb.cf.cf9.cha14;

public class Point {

    private double x;

    public  Point(){}

    public Point(int x){

        this.x = x;
    }

    public void setX(int x) {

    }

    public double getX(){
        return x;
    }

    public void movePlusOne(){
        x += 1;
    }

    private void movePlus10(){
        x += 10;
    }

    private void reset(){
        x = 0 ;
    }

}
