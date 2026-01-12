package gr.aueb.cf.cf9.cha16.callbacks;

public class Main {

    public static void main(String[] args) {

        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        };

        // Lambda expressions
        Printable printable2 = () -> System.out.println("Hello World!");
        Printable printable3 = () -> doPrint();

        // Method reference
        Printable printable4 = Main::doPrint;

        doWithPrintable(printable);
        doWithPrintable(printable2);
        doWithPrintable(printable3);
        doWithPrintable(printable4);

        System.out.println("------------------------- ANONYMOUS CLASSES");

        doWithPrintable(new Printable() {
            @Override
            public void print() {
                System.out.println("Hello World!");
            }
        });

        System.out.println("------------------------- LAMBDA EXPRESSIONS");

        doWithPrintable(() -> System.out.println("Hello World!"));

        System.out.println("------------------------- METHOD REFERENCES");

        doWithPrintable(Main::doPrint);
        doWithPrintable(System.out::println);
    }

    public static void doPrint() {
        System.out.println("Say hello");
    }

    public static void doWithPrintable(Printable printable) {
        System.out.println("Hello Printable");
        printable.print();   // <-- αυτό έλειπε
    }
}
