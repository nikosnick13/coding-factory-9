package gr.aueb.cf.cf9.review.mid_level;

public class StrConCat {
    public static void main(String[] args) {

        System.out.println(message("Alice",49));
    }

    public static String message(String name, int age){

        return "Hello, my name is " + name + " and a I'm " + age + " old ";
    }
}
