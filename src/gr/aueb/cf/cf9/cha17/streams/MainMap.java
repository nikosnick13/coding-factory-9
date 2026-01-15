package gr.aueb.cf.cf9.cha17.streams;

import gr.aueb.cf.cf9.cha17.sorting.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MainMap {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 89, 1, 334, 13, 19);

        List<Integer> squares = nums.stream()
                .map(num -> num * 2)
                .toList();
        squares.forEach(System.out::println);

        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.1, 50),
                new Product("Milk", 2.8, 100),
                new Product("Apples", 22.5, 120)
        ));


        List<String> newList = products.stream()
                .map(Product::getDescription)
                .toList();

        newList.stream().forEach(System.out::println);

        String stringLIst = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.joining(", "));

        System.out.println(stringLIst);
    }
}
