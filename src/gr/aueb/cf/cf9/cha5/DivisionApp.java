package gr.aueb.cf.cf9.cha5;

import java.util.Scanner;

/**
 * Διαίρεση και υπόλοιπα δεκαδικών
 */
public class DivisionApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1 = 0.0;
        double num2 = 0.0;
        double result = 0.0;
        double remainter = 0.0;

        System.out.println("Please enter two numbers (doubles): ");
        num1 = scanner.nextDouble();
        num2  = scanner.nextDouble();

        result = num1 / num2; //Διαίρεση δεκαδικών είναι δεκαδικός και η διαίρεση με το 0 δίνει Infinity
        remainter = num1 % num2; //Το υπόλοιπο είναι το υπόλοιπο είναι το υπόλοιπο της διαίρεσης με το ακέραιο μέρος

        System.out.println("Result: " + result);
        System.out.println("Remainter: " + remainter);

    }
}
