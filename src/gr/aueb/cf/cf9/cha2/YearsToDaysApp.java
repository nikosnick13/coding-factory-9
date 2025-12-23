package gr.aueb.cf.cf9.cha2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει την ηλικία του σε έτη (έστω ακέραιος)
 * και το πρόγραμμα επιστρέφει την ηλικία σε ημέρες, όπου
 * θεωρούμε ότι 1 έτος = 365 ημέρες. Για παράδειγμα, αν δοθεί
 * ηλικία 20 ετών, το αποτέλεσμα είναι 7300 ημέρες
 */
public class YearsToDaysApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userAge = 0;
        int ageInDays = 0;
        final  int DAYS_IN_YEARS = 365;

        System.out.println("Παρακαλω εισάγετε την ηλικία σας:");
        userAge = scanner.nextInt();
        ageInDays = userAge *  DAYS_IN_YEARS ;

        System.out.printf("Ηλικία σε έτη: %d. Η ηλικία σε μέρες: %,d", userAge,ageInDays);
    }
}
