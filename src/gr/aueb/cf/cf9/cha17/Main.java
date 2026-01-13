package gr.aueb.cf.cf9.cha17;

public class Main {

    public static void main(String[] args) {

        FlexibleNode flexibleNode = new FlexibleNode();
        flexibleNode.setValue("ad");
        // No compile-time safety
        int value = (int)flexibleNode.getValue();
        System.out.println(value);
    }
}
