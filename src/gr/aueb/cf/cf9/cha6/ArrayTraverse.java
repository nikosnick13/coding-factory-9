package gr.aueb.cf.cf9.cha6;

/**
 *  * Traverse an array. Διάσχιση, επίσκεψη
 *  * και εκτύπωση
 */
public class ArrayTraverse {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[3] = 3;
        int[] grades = {3, 3, 6, 8, 2, 6};
        int[] scores = new int[] {5,234, 324,654, 132,};

        for(int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

        for(int gread : grades ){
            System.out.println(gread);
        }

        for(int score : scores){
            System.out.print(score + " ");
        }
    }

}
