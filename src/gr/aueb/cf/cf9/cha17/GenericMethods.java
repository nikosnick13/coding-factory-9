package gr.aueb.cf.cf9.cha17;

import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {
        String[] towns = {"Athens", "Paris", "Agkira"};
        Integer[] intArr = {1,3,6,8,1};
        printArray(towns);
        printArray(intArr);

    }

    public static <T> void printArray(T[] arry){
        for(T element : arry){
            System.out.println(element);
        }
    }

    public static void print(GenericNode<?> node) {
        System.out.println(node.getValue());
    }

    public static void printNumbers(GenericNode<? extends Number> node) {
        System.out.println(node.getValue());
    }


    public static void printNumbers2(GenericNode<? super Integer> node) {
        System.out.println(node.getValue());
    }

    private static <T> void produceConsume(List<? super T> list, Iterable<? extends T> src) {
        for (T item : src) {
            list.add(item);
        }
    }
}
