package gr.aueb.cf.cf9.cha3;

import java.util.Scanner;

/**
 * Count the number of iterations.
 * When the user inserts -1,
 * the while-do loop will stop.
 */

public class IterationsCountApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικκοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iteration = 0;

        //Ειοαγωγή Δεδομένων
        System.out.println("Please enter a number:");
        num = scanner.nextInt();

        //Επεξεργασία Δεδομένων
        while (num != -1){

            iteration++;
            System.out.println("Please enter a number:");
            num = scanner.nextInt();
        }

        //Εκτύπωση Αποτελεσμάτων
        System.out.printf("The count of iteration is: %d%n",iteration);

    }
}
