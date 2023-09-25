package review10;

public abstract class Animal {
    abstract void speak();

    abstract void eat();
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("wuff wuff ");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to eat bones");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meow");
    }

    @Override
    void eat() {
        System.out.println("Cats like fish");
    }
}

