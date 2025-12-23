package gr.aueb.cf.cf9.cha3;

import java.util.Scanner;

/**
 * Count the number of positive numbers.
 * How many loops will be needed is a case that
 * happens @runtime.
 */

public class PositivesCountApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positives = 0;

        System.out.println("Please insert a number: ");
        num = scanner.nextInt();

        while (num >= 0){
            positives++;
            System.out.println("Please insert a number: ");
            num = scanner.nextInt();
        }

        System.out.printf("The count of positive numbers is: %d%n",positives);
    }

}
