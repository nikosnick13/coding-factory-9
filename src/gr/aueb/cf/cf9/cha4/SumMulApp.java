package gr.aueb.cf.cf9.cha4;

/**
 * Υπολογιζει καθ εκτυπόνει το άθροισμα
 * και το γινόμενο των 10 πρώτων ακεραίων
 */
public class SumMulApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul= 1;

        for(int i = 1; i <= 10; i++){

            sum = sum+ i; //sum += i
            mul *= i; //mul = mul*i
        }

        System.out.println("Sum:" + sum);
        System.out.println("Product:" + mul);
    }

}
