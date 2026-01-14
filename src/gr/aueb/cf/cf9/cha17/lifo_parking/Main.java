package gr.aueb.cf.cf9.cha17.lifo_parking;

public class Main {

    public static void main(String[] args) {

        Lifo_parking garazFlor1 =  new Lifo_parking();

        garazFlor1.addCar("ASD1202");
        garazFlor1.addCar("AOR12345");
        garazFlor1.getParking();
        garazFlor1.addCar("AOR12324");

        String lastCar = garazFlor1.removeCar();
        System.out.println(lastCar);

        garazFlor1.traverse();
    }
}
