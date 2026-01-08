package gr.aueb.cf.cf9.cha15;

public class Main {
    public static void main(String[] args) {

        ISpeakable cat = new Cat("Alice ");
        ISpeakable dog = new Dog("Bob",3);
        Cat cat1 = new Cat("Tery ");

        GenericSpeakingSchool gereric = new GenericSpeakingSchool(cat);
        GenericSpeakingSchool gereric1 = new GenericSpeakingSchool(cat1);

        gereric1.speak();
        gereric.speak();
//        doSpeak(cat);
//        doSpeak(dog);


    }

    public static void doSpeak(ISpeakable iSpeakable){

        iSpeakable.speak();
    }
}
