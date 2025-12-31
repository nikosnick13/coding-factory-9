package gr.aueb.cf.cf9.cha13;

import java.util.Random;

public class Point {

    private int x;
    private int y;

    public Point(){

    }
    public  Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Static factory method.
     * @return
     */
    public static Point getInstance(){
        return new Point();
    }

    public static Point getRandomPoint(){
        final int BOUND = 100;
        Random random = new Random(System.currentTimeMillis());

        // (max - min + 1) + 1
        return new Point(random.nextInt(BOUND - 1 + 1) + 1, random.nextInt(BOUND - 1 + 1) + 1);
    }
}
