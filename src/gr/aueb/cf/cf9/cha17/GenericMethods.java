package gr.aueb.cf.cf9.cha17;

public class GenericMethods {

    public static void main(String[] args) {
        String[] towns = {"Athens", "Paris", "Agira"};
        Integer[] intArr = {1,3,6,8,1};
        printArray(towns);
        printArray(intArr);

    }

    public static <T> void printArray(T[] arry){
        for(T element : arry){
            System.out.println(element);
        }
    }
}
