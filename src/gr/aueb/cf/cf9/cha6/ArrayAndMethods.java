package gr.aueb.cf.cf9.cha6;

/**
 * Arrays and Methods.
 * Demo of how we pass an array as a formal parameter
 * and also how we return an array from a method.
 */
public class ArrayAndMethods {

    public static void main(String[] args) {

        int[] myArr = new int[6];
        printArray(myArr, 1,6);
        int[] arr = getArray5();
    }

    /**
     * Prints the contents of the array.
     * @param arr   the input array.
     */
    public static void printArray(int[] arr){
        for(int items : arr){
            System.out.println(items + " ");
        }
    }
    /**
     *
     * Prints the contents of the array.
     * Assumption: high is exclusive.
     * @param arr
     * @param low
     * @param high
     */
    public static void printArray(int[] arr, int low, int high){

        if( low < 0 || high > arr.length ) return;
        if( low > high) return;

        for(int i = 0; i <high; i++){
            System.out.println(arr[i] + " ");
        }
    }
    /**
     * Returns a new array of size 5.
     * @return the pointer 5
     */
    public static int[] getArray5() {
        return new int[5];
    }

}
