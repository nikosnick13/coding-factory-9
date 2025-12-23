package gr.aueb.cf.cf9.cha3;

import java.util.Scanner;

/**
 * Calculates the power of a number, base^power.
 * base^power = base * base * base * ... * base
 * (power φορές)
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0 ;
        int i = 1;
        int result = 1;

        System.out.println("Παρακαλούμε εισάγετε το base και το power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power){

            result  *=  base; // result = result * base
            i++;

        }
        System.out.printf("%d ^ %d = %d%n",base,power,result);
    }
}
