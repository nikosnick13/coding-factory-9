package gr.aueb.cf.cf9.cha3;

/*
 * The user insert the temperature, and the booleans status of running
 * variable and calculates if it is snowing or not. If it is running end
 * the temperature us below 0, it is snowing
 **/

import java.util.Scanner;
public class SnowingApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputTemperature = 0;
        boolean isRunning  = false;
        boolean isSnowing = false;

        System.out.println("Παρακαλώ εισάγετε αν βρέχει (true/false):");
        isRunning = scanner.nextBoolean();
        System.out.println("Παρακαλώ εισάγετε την θερμοκρασία:");
        inputTemperature = scanner.nextInt();


        isSnowing = isRunning && (inputTemperature < 0);

        System.out.println("Is snowing: " + isSnowing);

    }
}
