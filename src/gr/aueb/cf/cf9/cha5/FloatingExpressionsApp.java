package gr.aueb.cf.cf9.cha5;

/**
 * Demo of Flouting Point Expressions
 */
public class FloatingExpressionsApp {

    public static void main(String[] args) {

        int intNum = 10;
        float floatNum = 1.5494f;

        double result = 0.0;

        result = intNum + floatNum + result; //Ολα μετρέποντε στον μεγαλήτερο τύπο

        System.out.println("This is a double: " + result);
        System.out.printf("Result: %.2f", result);
    }
}
