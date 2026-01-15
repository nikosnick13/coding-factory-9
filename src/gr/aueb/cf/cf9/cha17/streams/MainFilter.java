package gr.aueb.cf.cf9.cha17.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()
                .filter( num -> num % 2 == 0)
                .forEach(System.out::println);

        List<Integer> evenNumber = numbers.stream()
                .filter( x-> x % 2 == 0)
                .toList();

        List<Integer>  evenNumber2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("================================================================");

        int[] arr = {1,23,4,5,67,8,9,0,1,34,54,10};
        var newArr =  Arrays.stream(arr)
                .filter(x -> x % 2 == 0);
        newArr.forEach(System.out::println);


    }
}
