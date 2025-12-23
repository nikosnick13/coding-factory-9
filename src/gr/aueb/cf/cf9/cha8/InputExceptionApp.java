package gr.aueb.cf.cf9.cha8;

import java.util.Scanner;

/**
 * To {@link java.util.InputMismatchException} συμβαινει όταν
 * ο {@link  java.util.Scanner} αποτυγζάνει να διαβάσει
 * το σωστό τύπο δεδομένων
 */
public class InputExceptionApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter one it: ");
        //num = scanner.nextInt();

        while (!scanner.hasNextInt()){
            System.out.println("Μη αποδεκτοί χαρακτήρες");
            scanner.nextLine();
        }

        System.out.println("NUm: " + num) ;

    }
}