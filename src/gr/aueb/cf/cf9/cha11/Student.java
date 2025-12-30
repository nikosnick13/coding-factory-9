package gr.aueb.cf.cf9.cha11;

public class Student {

    private static int studentsCount = 0;

    private int id;
    private String firstName;
    private String lastName;

    //Default Constructor
    public Student(){
        studentsCount++;
    }

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        studentsCount++;
    }

    public String getFirstName() {    //Convention: getXxx camelCase
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {            //Convention: setXxx camelCase
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setId(int id) {
        this.id = id;
    }
    public static int getStudentsCount(){
        return studentsCount;
        // this.id = 0;   //απο static καλούμε μόνο static, όχι instant
    }

}
