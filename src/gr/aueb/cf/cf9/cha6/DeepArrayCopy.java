package gr.aueb.cf.cf9.cha6;

/**
 * Defensive Array Copy. Deep Copy.
 * Fresh copy of the array.
 */
public class DeepArrayCopy {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 2};

        int[] newArrCopy;

        newArrCopy = getArrayCopy(arr);

        for (int i : newArrCopy){
            System.out.println(i + " ");
        }

        newArrCopy[0] = 1000;
        System.out.println(newArrCopy[0]);

    }

    public static int[] getArrayCopy(int[] arr){

        int[] arrCopy = new int[arr.length];

        for(int i = 0; i < arr.length; i++){

            arrCopy[i] = arr[i];
        }
        return  arrCopy;
    }
}
