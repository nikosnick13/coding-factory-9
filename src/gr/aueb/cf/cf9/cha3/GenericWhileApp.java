package gr.aueb.cf.cf9.cha3;

import java.sql.SQLOutput;

/**
 * Δινουμε αρχική τιμή και βήμα αύξησης
 * και υπολογίζει το πλήθοσ των επαναλήψεων
 */
public class GenericWhileApp {

    public static void main(String[] args) {

        int i = 1;
        int endVal = 10;

        while (i <= endVal){
            System.out.println("i = "+ i);
            i++;
        }
        System.out.println("Επαναλήψεις / Loops / Interations = " + (i-1));
    }

}
