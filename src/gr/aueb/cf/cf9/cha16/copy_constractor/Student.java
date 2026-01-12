package gr.aueb.cf.cf9.cha16.copy_constractor;

public class Student {

    private final String name;
    private final City city;

    public Student(){
        this.name = "";
        this.city = new City();
    }

    public Student(Student student){
        this.name = student.name;
        this.city = new City(student.getCity());
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

}
