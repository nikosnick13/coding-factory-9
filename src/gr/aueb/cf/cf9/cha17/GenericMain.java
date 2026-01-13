package gr.aueb.cf.cf9.cha17;

public class GenericMain {

    public static void main(String[] args) {
        GenericNode<String> node = new GenericNode<>();
        GenericNode<Double> doubleNode = new GenericNode<>();

        doubleNode.setValue(2.1);
        node.setValue("Nikolas");

        System.out.println(doubleNode.getValue());
        System.out.println(node.getValue());
    }


}
