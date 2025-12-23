package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

public class EvenApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        // Είσοδος Δεδομένων, Validation και Data Binding
        System.out.println("Please ender a number:");
        while (! scanner.hasNextInt()){
            System.out.println("Invalid data. Please enter a number");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        //Επιχειρασιακή λογική - Business logic (ΠΑΡΑΣΤΑΣΕΙΣ)
        result = isEven(num);

        //Εκτύπωση αποτελέσματοσ
        System.out.printf("The number %d is even \n",num );
    }

    /**
     *Check the number is even
     * @param num is the number το check
     * @return true if the num is even
     */
    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
