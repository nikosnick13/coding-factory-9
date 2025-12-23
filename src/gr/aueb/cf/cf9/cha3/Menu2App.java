package gr.aueb.cf.cf9.cha3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών μέχρι ο χρήστης
 * να επιλέξει 'Exit' (τον αριθμό 3).
 */
public class Menu2App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true){
            System.out.println("Please insert a number above: ");
            System.out.println("1. Entry Appley");
            System.out.println("2. Delete Appley");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            if (choice ==3 ) {
                break;
            }
        }
        System.out.println("Good Bay");
    }
}
