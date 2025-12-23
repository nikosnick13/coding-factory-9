package gr.aueb.cf.cf9.review.mid_level;

/*
 * Δεν έχει documentation
 * Δεν έχει δομή
 * Δεν έχει SoC
 */
public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 35, 45, 956, 0};
        int result = 0 ;

        result = maxValue(arr);

        System.out.printf("The bigger integer is: %d", result);
    }

    public static int maxValue(int[] arr ){
        if(arr == null || arr.length ==0) return Integer.MAX_VALUE;
        int max = arr[0];

        for(int i = 1; i < arr.length ; i++ ){
            if(arr[i] > max )  max = arr[i];
        }
        return max;
    }

}
