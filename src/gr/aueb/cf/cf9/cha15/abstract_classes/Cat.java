package gr.aueb.cf.cf9.cha15.abstract_classes;

public class Cat extends Animal{

    @Override
    public void speak() {
        System.out.println("Meuw!!!");

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("She all the food");
    }
}
