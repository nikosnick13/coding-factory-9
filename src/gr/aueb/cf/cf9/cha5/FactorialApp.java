package gr.aueb.cf.cf9.cha5;

import java.util.Scanner;
/**
 * Υπολογίζει το παραγοντικό του n,
 * με μέθοδο. To n! = 1 * 2 * 3 * 4 * ... * n
 * Kαι 0! = 1
 */
public class FactorialApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 0;

        // Input data from the user and data binding
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        result = facto(num);

        System.out.printf("The factorial %d is: %d", num, result);

    }

    /**
     * Calculates the factorial of n.
     *
     * @param a    the number to calculate factorial of.
     * @return      the factorial of n.
     */
    public static  int facto(int a){
        int factorial = 1;

        for(int i = 1; i <= a; i++){

            factorial *= i;
        }
        return  factorial;
    }
}
