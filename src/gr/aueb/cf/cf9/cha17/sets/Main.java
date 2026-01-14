package gr.aueb.cf.cf9.cha17.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();
        // add - No duplicates
        bag.add("apple");
        bag.add("banana");
        bag.add("orange");
        bag.add("apple");       // No duplicates allowed

        if (bag.contains("apple")){
            bag.remove("apple");
        }else{
            System.out.println("Apple not included in the bag.");
        }
        bag.removeIf(item -> item.startsWith("b")); //θα διαγραψει απο την bag με οτι ξεκιναει με b
        bag.forEach(System.out::println);
    }
}
