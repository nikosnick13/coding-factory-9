package gr.aueb.cf.cf9.cha6;

/**
 * Είναι πίνακες με διαφορετική διάσταση
 * σε κάθε γραμμή.
 */
public class JaggedArrays {

    public static void main(String[] args) {

        int[][] arr = new int[3][];

        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int [6];

        arr[0] = new int[]{1, 2, 4};

        for(int[]row: arr){
            for (int el : row){
                System.out.print(el+ " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
