package gr.aueb.cf.cf9.cha5;

/**
 * Demo App for Doubles and Floats
 */
public class FloatingPoint {

    public static void main(String[] args) {

        System.out.printf("Float Size: %d, Min: %2e, Max %2e\n", Float.BYTES * 8, Float.MAX_VALUE, Float.MIN_VALUE);
        System.out.printf("Double Size: %d, Min: %2e, Max %2e", Double.BYTES * 8, Double.MAX_VALUE, Double.MIN_VALUE);
    }
}
