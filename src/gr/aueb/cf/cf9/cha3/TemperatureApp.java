package gr.aueb.cf.cf9.cha3;
/**
 * Ο χρήστης εισάγει ένα ακέραιο που συμβολίζει μία
 * θερμοκρασία. Και το πρόγραμμα υπολογίζει αν η
 * θερμοκρασία < 0 τότε μια μεταβλητή γίνεται true,
 * αλλιώς γίνεται false
 */
import java.util.Scanner;

public class TemperatureApp {

    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int temperatureInput = 0;
        boolean isTempBelowZero = false;

        //Εισαγωγή Δεδομένων
        System.out.println("Παρακαλώ εισάγεται μια θερμοκρασία:");
        temperatureInput = scanner.nextInt();

        //Επεξεργασία των δεδομένων
         isTempBelowZero = temperatureInput < 0 ;

        // Εκτύπωση των αποτελεσμάτων
        System.out.println("Η θερμοκρασία είναι μικρότερη από 0: " + isTempBelowZero);
    }
}
