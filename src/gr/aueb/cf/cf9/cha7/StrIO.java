package gr.aueb.cf.cf9.cha7;

import java.util.Scanner;

/**
 * String input / output
 */

public class StrIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        String str1 = "";

        System.out.println("Please enter two stringd:");
        str = scanner.next();   // διαβάζει μέχρι να βρει whitespace (spaces, tab, new l
        str1 = scanner.nextLine(); // διαβάζει μέχρι να βρει new line
    }
}
