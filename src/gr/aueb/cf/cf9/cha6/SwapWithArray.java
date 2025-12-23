package gr.aueb.cf.cf9.cha6;

public class SwapWithArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2 };

        System.out.println("arr[0]: " + arr[0]);
        System.out.println("arr[1]: " + arr[1]);
        swap(arr);
        System.out.println("arr[0]: " + arr[0]);
        System.out.println("arr[1]: " + arr[1]);
    }


    /**
     * Swaps the values of the first two elements of the array.
     * @param arr   the input array.
     */
    public static void swap(int[] arr){

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;

    }
}
