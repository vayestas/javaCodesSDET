package class20;

public class Animal {
    void speak(){
        System.out.println("Animals can speak");
    }
    void sleep(){
        System.out.println("Animals sleep");
    }
    void eat(){
        System.out.println("Animals eat");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("wuff wuff");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meow meow");
    }
}