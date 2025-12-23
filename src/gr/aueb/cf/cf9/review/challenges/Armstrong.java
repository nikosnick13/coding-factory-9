package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * Ένας αριθμός Armstrong είναι ένας αριθμός
 * που είναι ίσος με το άθροισμα των ψηφίων του
 * όπου το κάθε ψηφίο έχει υψωθεί στη δύναμη του
 * αριθμού των ψηφίων.
 *
 * Για παράδειγμα, 153 = 1^3 + 5^3 + 3^3
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int initialNUm = 0;
        int numberOfDigits = 0;
        int digit = 0;
        int sum = 0;
        System.out.println("Please ender a number:");
        num = scanner.nextInt();

        numberOfDigits = String.valueOf(num).length();


        initialNUm = num;
        
        while (num != 0){
            digit = num % 10;
            sum += (int)Math.pow(digit,numberOfDigits);
            num /= 10;

        }
       System.out.printf("%d%s Armstrong\n", initialNUm, (sum == initialNUm) ? " is" : " is not");
    }
}
