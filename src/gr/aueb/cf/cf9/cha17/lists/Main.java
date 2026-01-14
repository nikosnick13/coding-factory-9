package gr.aueb.cf.cf9.cha17.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        //add
        cities.add("Athens"); //index 0
        cities.add("Paris"); //index 1
        cities.add("Berlin");//index 2

        //get
        String myCity = cities.get(0);
        System.out.println(myCity);

        //set - update
        int position = cities.indexOf("Paris");   // override equals
        if( position == -1){
            System.out.println("City is not found");
        } else {
            cities.set(position,"London");
        }

        //remove
        if(cities.contains("London")){
            cities.remove("London");
        } else {
            System.out.println("City not fount");
        }

        //travers with fot
        for(int i =0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        // Traverse with enhanced for
       for(String city : cities){
           System.out.println(city);
       }
        // Iterator
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println(city);
        }

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Tokyo")) {
                it.remove();        // cities.remove("Tokyo"); fails fast
            }
        }

        cities.removeIf(c -> c.equals("Tokyo"));
        // cities.forEach(c -> System.out.println(c));
        cities.forEach(System.out::println);

    }
}
