package gr.aueb.cf.cf9.cha15;

public class Dog implements ISpeakable{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(){

    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void speak() {
        System.out.println(name + " say hello");
    }
}
