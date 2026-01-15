package gr.aueb.cf.cf9.cha17.streams;

import gr.aueb.cf.cf9.cha17.sorting.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceMain {

    public static void main(String[] args) {
        List<Integer> nums = List.of(1,3,4,6,7,8);

        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.1, 50),
                new Product("Milk", 2.8, 100),
                new Product("Apples", 22.5, 120)
        ));

        int totalSUm = nums.stream()
                .reduce(0,(sum,num) -> sum + num);
        int totalSum2 = nums.stream()
                .reduce(0,Integer::sum);

        System.out.println(totalSum2);

        System.out.println(totalSUm);

       int sumOfQuantity = products.stream()
               .map(Product::getQuantity)
               .reduce(0,Integer::sum);

       int sumOfQuantity2 = products.stream()
               .map( x-> x.getQuantity())
               .reduce(0, (sum,qnt) -> sum + qnt);


        int sumOfQuantities = products.stream()
                .mapToInt(Product::getQuantity)
                .reduce(0, Integer::sum);

        int sumOfQuantities2 = products.stream()
                .mapToInt(Product::getQuantity)
                .sum();             // works with primitive types

        System.out.println(sumOfQuantity);
        System.out.println(sumOfQuantity2);
        System.out.println(sumOfQuantities);
        System.out.println(sumOfQuantities2);



        // Sorted list with product descriptions for quantities >= 100

        var sortedProductsDescriptionsGEQ100 = products.stream()
                .filter(x -> x.getQuantity() >= 100)
                .sorted(Comparator.comparing(Product::getDescription))
                .map(Product::getDescription)
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));

            sortedProductsDescriptionsGEQ100.forEach(System.out::println);




    }




}
