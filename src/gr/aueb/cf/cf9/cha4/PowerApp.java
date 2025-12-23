package gr.aueb.cf.cf9.cha4;

import java.util.Scanner;

/**
 * O Χρήσης εισάγη τα base και  power και το πρόγραμμα
 * υπολογίζει το base^power, πχ. 2^10= 1024
 */
public class PowerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int base = 0 ;
        int power = 0 ;
        int result = 1;

        System.out.println("Παρακαλώ εισάγετε μια βάση:");
        base = scanner.nextInt();

        System.out.println("Παρακαλώ εισάγετε μια δύναμη:");
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++){
            result = result * base;
        }

        System.out.printf("%d ^ %d = %d",base, power, result);
    }
}
