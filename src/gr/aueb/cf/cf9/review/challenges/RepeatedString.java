package gr.aueb.cf.cf9.review.challenges;

 /**
 * Δοθέντος ενός {@link String} επιστρέφει ένα String
 * που αποτελεί επανάληψη του αρχικού String, n φορές.
 */
public class RepeatedString {
     public static void main(String[] args) {
         System.out.println( repeateString("Hello World\n", 10));
         System.out.println(repeateString2("Hello Again\n", 10));
     }

     public static String repeateString(String str, int n){
         return str.repeat(n);
     }

     public  static String repeateString2(String str, int n){
         StringBuilder sn = new StringBuilder();

         for(int i = 0; i < n; i++){

               sn.append(str);
         }
            return sn.toString();
     }
}
