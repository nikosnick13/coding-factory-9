package gr.aueb.cf.cf9.cha3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού μέχρι ο χρήστης να
 * επιλέξει 'Exit'.
 */

public class MenuApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("Please insert a number above: ");
            System.out.println("1. Entry Appley");
            System.out.println("2. Delete Appley");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
        }while (choice !=3 );

        System.out.println("Thanks you to using our program");
    }
}
