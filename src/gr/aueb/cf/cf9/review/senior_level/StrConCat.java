package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Create a message that contains the name of the user and the age.
 */
public class StrConCat {

    public static void main(String[] args) {
        //Δήλωση και αρχικοπίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String message = "";
        int age = 0;

        //Είσοδο δεδωμένων απο τον χρήστη,validation και binding data
        System.out.println("Please insert your name:");
        name = scanner.nextLine();
        System.out.println("Please insert your age: ");
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a number: ");
            scanner.nextLine();
        }
        age = scanner.nextInt();

        //Call a services
        message = createMessage(name,age);

        //Εκτύπωση αποτελεσμάτων
        System.out.println(message);
    }

    /**
     *
     * @param msg
     * @param age
     * @return the message
     */
    public  static String createMessage(String msg, int age){
        return String.format("Hello, my name is %s and a I'm %d old", msg,age);

    }
}
