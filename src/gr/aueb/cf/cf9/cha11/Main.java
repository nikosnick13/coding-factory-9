package gr.aueb.cf.cf9.cha11;

/**
 * Java Bean.
 * Data class που έχει
 *   - private πεδία
 *   - Default constructor
 *   - getters & setters με συμβάσεις
 */
public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

        User user = new User();
        User nikoloas = new User(true, "12345", "CyberPirate", "NIkoalidis", "Nikolas",1l);

        Product milk = new Product(12L, "Milk A","Light Milk", 1.3, 3, true);
        Product juice = new Product(13L, "Oranje","Orange with banana", 2, 30, true);

        Customer customer = new Customer();
        Customer customer1 = new Customer();

        Student student2 = new Student(3,"Makis", "Kapetis");
        student2.setFirstName("Xrisostomos");

        //setter
        alice.setId(1);
        alice.setFirstName("Alice");
        alice.setLastName("Wonterland");

        bob.setId(2);
        bob.setFirstName("Bob");
        bob.setLastName("Dylan");

        student.setId(3);
        student.setFirstName("Nikos");
        student.setLastName("Nikolaidis");

        //getters
        System.out.println(alice.getId());
        System.out.println(alice.getFirstName());
        System.out.println(alice.getLastName());

        System.out.println(Student.getStudentsCount());

        System.out.printf("Id: %d, Firstname: %s, Lastname: %s%n", bob.getId(), bob.getFirstName(), bob.getLastName());
        System.out.printf("Id: %d, Firstname: %s, Lastname: %s%n", student.getId(), student.getFirstName(), student.getLastName());
    }
}