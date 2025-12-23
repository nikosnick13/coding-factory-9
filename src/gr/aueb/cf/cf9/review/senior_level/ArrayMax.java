package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;


/**
 * Calculate the maximum value of an array.
 */
public class ArrayMax {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 6 ;
        int[] numbers = new int[SIZE];
        int maxPosition = 0;
        int maxValue = 0;

        //Είσοδος δεδομένων απο τον χρήστη, validation, data binding
        System.out.println("Please enter six integers:");
        for(int i = 0; i < numbers.length; i++){

            // Validate input
            while (! scanner.hasNextInt()){
                System.out.println("Invalid data. Please insert a number:");
                scanner.nextLine();
            }
            numbers[i] = scanner.nextInt();
        }

        // Delegation - καλεί υπηρεσίες / μεθόδους
        maxPosition = maxValue(numbers);
        maxValue = numbers[maxPosition];

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("The maximum value is %d at position %d.\n", maxValue, (maxPosition + 1));

    }

    /**
     * Find the position of the maximum value in an array.
     * @param arr   the input array.
     * @return      the position of the maximum value.
     */
    public static int maxValue(int[] arr ){

        if(arr == null || arr.length == 0 ) return Integer.MAX_VALUE;
        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for(int i = 1; i < arr.length;  i++){
            if( arr[i] > maxValue ){

                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

}
