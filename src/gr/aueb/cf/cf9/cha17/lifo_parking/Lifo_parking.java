package gr.aueb.cf.cf9.cha17.lifo_parking;

import java.time.LocalDateTime;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Lifo_parking {

    private final Deque<String> parking = new LinkedList<>();

    public Lifo_parking(){

    }

    public List<String> getParking() {
        return List.copyOf(parking);
    }

    // Public API

    //add
    public void addCar(String car){
        parking.push(car);
        System.out.println(LocalDateTime.now() +" : " + ",Είσοδος, Αρ. ΠΙνακίδας=" + car);
    }

    //remove
    public String removeCar(){
        String car = parking.pop();
        System.out.println(LocalDateTime.now() +" : " + ",Εξοδος, Αρ. ΠΙνακίδας=" + car);
        return car;
    }

    //isEmpty
    public boolean isEmpty(){
        return parking.isEmpty();
    }

    //Travers
    public void traverse() {
        parking.forEach(System.out::println);
    }

}
