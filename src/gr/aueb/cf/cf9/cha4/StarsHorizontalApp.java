package gr.aueb.cf.cf9.cha4;

/**
 * Print 10 * horizontal
 */
public class StarsHorizontalApp {

    public static void main(String[] args) {

        // HORIZONTAL STARS
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        // vertiacl STARS
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        // GRID 10x10 - Nested for loops
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 1, 2, 3, ... stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 10, 9, 8, ... stars
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}