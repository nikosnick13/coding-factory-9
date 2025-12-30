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