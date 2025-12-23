package gr.aueb.cf.cf9.cha6;

/**
 * Βρίσκει το ελάχιστο στοιχείο ενός πίνακα.
 */
public class ArrayMIn {

    public static void main(String[] args) {

        int[] arr = {4, 45, 67, 345, 131, 4636, 131, 12, 48, 5668};
        int resultForMInValue = 0;
        int resultForMaxValue = 0;

        resultForMInValue = getMinPosition(arr);
        resultForMaxValue = getMaxPosition(arr);
        System.out.println("Το μικρότερο στοιχιο ειναι το: " + arr[resultForMInValue]);

        System.out.println("Το μεγαλύτερο στοιχιο ειναι το: " + arr[resultForMaxValue ]);

    }

    public static int getMinPosition( int[] arr){
        if (arr == null || arr.length == 0) return -1;
        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++){
            if ( arr[i] < minValue){
                minPosition = i;
                minValue =  arr[i];
            }
        }
        return  minPosition;
    }

    public static int getMinPosition2(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr){

        if( arr == null || arr.length < 1 ) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++){
            if ( arr[i] > maxValue){
                maxPosition = i;
                maxValue =  arr[i];
            }
        }
        return  maxPosition;
    }

    public static int getMaxPosition2(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
