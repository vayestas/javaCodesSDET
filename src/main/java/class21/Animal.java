package class21;

public abstract class Animal {
    String name;
    String breed;
    String color;

    abstract void speak();
    abstract void sleep();
    abstract void eat();
    //abstract String getString(String a ,int b)
    public void printInfo(){
        System.out.println(name+breed+" "+color);
    }

}
class Dog extends Animal{
    @Override
    void speak() { // methods
        System.out.println("wuff wuff...");
    }

    @Override
    void sleep() {
        System.out.println("Sleeping for at least 10 hours");
    }

    @Override
    void eat() {
        System.out.println("Eating bones");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("mew meow...");
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep for 12-16 hours");
    }

    @Override
    void eat() {
        System.out.println("Like to eat fish");
    }
}