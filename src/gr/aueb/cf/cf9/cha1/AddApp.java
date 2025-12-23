package gr.aueb.cf.cf9.cha1;

/*
* Print two integers and display the result
* */
public class AddApp {

    public static void main(String[] args) {

        //d
        int num1 = 500_000;
        int num2 = 10_000;
        int result;

        result = num1 + num2;


        System.out.println("The result is: " + result);
        System.out.println("The " + num1 + " + " + num2 + " is: " + result );
        System.out.printf("The %,d + %,d is : %,d\n",num1, num2, result);
    }
}
