package class10;

public class DogTester {

    public static void main(String[] args) {
        // creating an obj from the Dog class
        Dog lunaOjb=new Dog();
        // assigning a value to name using lunaObj
        lunaOjb.name="Luna";
        lunaOjb.breed="Shiba";
        lunaOjb.gender='F';
        lunaOjb.age=25;
        lunaOjb.weight=10;
        System.out.println(lunaOjb.name);
        System.out.println(lunaOjb.age);
        System.out.println(lunaOjb.breed);

        // we are calling the bark method on lunaObj
        lunaOjb.bark();
        lunaOjb.eat();
        lunaOjb.sleep();
    }
}
