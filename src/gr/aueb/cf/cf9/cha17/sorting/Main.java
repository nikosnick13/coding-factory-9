package gr.aueb.cf.cf9.cha17.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.1, 50),
                new Product("Milk", 2.8, 100),
                new Product("Apples", 22.5, 120)
        ));

        products.sort(Comparator.naturalOrder());
        products.forEach(System.out::println);

        products.sort(Comparator.reverseOrder());

        products.sort(Comparator.comparing(Product::getPrice));

        products.sort(Comparator.naturalOrder());   // Ascending order
        products.forEach(System.out::println);

        products.sort(Comparator.reverseOrder());   // Descending order

        products.sort(Comparator.comparing(Product::getPrice));
        //products.sort((a, b) -> b.getQuantity() - a.getQuantity());     // Ascending order

        products.sort(Comparator.comparing(Product::getQuantity)
                .thenComparing(Product::getPrice, Comparator.reverseOrder())        // price descending
                .thenComparing(Product::getDescription).reversed());


    }
}
