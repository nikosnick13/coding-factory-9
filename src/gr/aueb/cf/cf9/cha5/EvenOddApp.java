package gr.aueb.cf.cf9.cha5;

import java.util.Scanner;

/**
 * App with calculate if
 * the number ho gives by user is
 * Even or Odd
 */

public class EvenOddApp {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userNum = 0;
        int result = 0;

        System.out.println("Please insert a number: ");
        userNum = scanner.nextInt();
        result = evenCalc(userNum);

        if(result == 0){
            System.out.println(userNum + " This number is Even");
        }
        if(result != 0){
            System.out.println("This number is Odd");
        }

    }


    /**
     *
     * @param a
     * @return if the result is division by 2
     */
    public static int evenCalc(int a){

        return  a % 2;
    }


}
