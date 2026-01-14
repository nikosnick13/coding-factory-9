package gr.aueb.cf.cf9.cha17.sorting;

public class Product implements Comparable<Product>{

    private  double price;
    private  String description;
    private  int quantity;

    public Product(){

    }

    public Product(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Product other) {
        return this.description.compareTo(other.description);
    }

/*    @Override
    public int compareTo(Product other) {
//        if(this.quantity < other.quantity){
//            return -1;
//        }else if(this.quantity > other.quantity){
//            return 1;
//        }else {
//            return 0;
//        }
        return this.quantity - other.quantity;*/

//    @Override
//    public int compareTo(Product other){
//        return Double.compare(this.price, other.price);
//    }

}

