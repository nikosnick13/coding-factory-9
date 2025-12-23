package gr.aueb.cf.cf9.cha2;

import java.util.Scanner;
/**
 * The user inserts the weight in kilograms, and the program calculates
 * the weight in grams.
 */
public class KiloToGramsApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInputKilo = 0;
        int kiloToGrams = 0;
        final int KILOSGRAMS_TO_GRAMS = 1000;

        System.out.println("Παρακαλώ εισάγετε το βάρος σε κιλά: ");
        userInputKilo = scanner.nextInt();
        kiloToGrams = userInputKilo *  KILOSGRAMS_TO_GRAMS;

        System.out.printf("Το βάρος σε γραμμάρια των %d κιλών είναι: %,d γραμμάρια.",userInputKilo, kiloToGrams);
    }
}
