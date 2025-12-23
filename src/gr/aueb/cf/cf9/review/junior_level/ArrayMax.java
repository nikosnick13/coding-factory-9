package gr.aueb.cf.cf9.review.junior_level;

/*
 * Οι μεταβλητές a, m δεν είναι 'καλά' ονόματα
 * Ο κώδικας θα μπορούσε να είναι μέθοδος
 * Δεν έχει documentation
 * Δεν υπάρχει έλεγχος για κενό array
 * Δεν έχει δομή
 * Δεν έχει SoC
 */
public class ArrayMax {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 35, 45, 956, 0};
        int b = a[0];

        for(int i = 1; i < a.length ; i++ ){

            if(a[i] > b ){
                b = a[i];
            }
        }
        System.out.println(b);
    }
}
