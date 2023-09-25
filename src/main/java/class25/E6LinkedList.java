package class25;

import java.util.LinkedList;

public class E6LinkedList {
    public static void main(String[] args) {

        LinkedList<Dog> dogs=new LinkedList<>();
        dogs.add(new Dog("Capone", "Labrador"));
        dogs.add(new Dog("Chata", "Pitbull"));
        dogs.add(new Dog("Canelo", "Pitbull"));

        // getting the object stored on index 2 and storing it inside the d variables
        Dog d=dogs.get(2);
        System.out.println();
    }
}
class Dog{
    String name;
    String breed;

    public Dog(String name, String breed) { // constructor
        this.name = name;
        this.breed = breed;
    }

    void printInfo(){       // method
        System.out.println(name+" "+breed);
    }
}