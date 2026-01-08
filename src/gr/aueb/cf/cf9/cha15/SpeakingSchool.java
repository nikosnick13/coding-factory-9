package gr.aueb.cf.cf9.cha15;

public class SpeakingSchool {

    // tightly coupled
    private final Cat cat = new Cat();     // composition, private instance

    public SpeakingSchool(){

    }

    public void speak(){

        cat.speak();
    }

}
