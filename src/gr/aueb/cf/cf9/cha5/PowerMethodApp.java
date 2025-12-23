package gr.aueb.cf.cf9.cha5;

import java.util.Scanner;


/**
 * Υπολογίζει τη δύναμη a^b με μέθοδο.
 *
 */
public class PowerMethodApp {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int userInputBase = 0;
        int userInputRase =0;
        int result = 0;

        System.out.println("Pleas ender a number for base: ");
        userInputBase = scanner.nextInt();

        System.out.println("Pleas ender a number for rase: ");
        userInputRase = scanner.nextInt();

        result =  pow(userInputBase, userInputRase);

        System.out.printf("%d ^ %d = %d",userInputBase, userInputRase, result);


    }
    /**
     * Calculate a^b.
     * @param a     the base.
     * @param b     the exponent.
     * @return      the result.
     */
    public static  int  pow(int a, int b){

        int result = 1;

        for(int i = 0; i < b; i++){

            result = result * a;
        }
        return  result;
    }
}
