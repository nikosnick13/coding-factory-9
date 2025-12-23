package gr.aueb.cf.cf9.cha3;

public class SumMul10 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        int mul = 1;
        int j  = 1;

        while (i <= 10){
            sum += 1;
            i++;
            System.out.println(sum);
        }

        while (j <= 10){

            mul *=j;
            j++;
        }
        System.out.println("Sum = "+sum);
        System.out.println("Product = "+ mul);
    }
}
