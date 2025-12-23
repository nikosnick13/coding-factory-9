package gr.aueb.cf.cf9.cha3;

import java.util.Scanner;

/**
 * Υπολογίζει το απόλυτο ενός ακαιρίου με την χρήση
 * τριαδικό τελεστή. Το απόλυτο ενος ακεράιου είναι θετικός
 * αριθμός. Για παράδειγμα το απόλυτο του -5 ειναι =  5
 */
public class AbsTernary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        //Input- Είσοδος Δεδομένων
        num = scanner.nextInt();

        if(num > 0){
            abs = num;
        }else {
            abs = -num;
        }
        abs = (num>=0) ? num : -num; //expression - Syntactic sugar

    }
}
