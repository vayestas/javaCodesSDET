package class20;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple,
    Lenovo, HP, Dell. Define common behavior within and some fields in
    parent class and override some of the methods in child classes. Define
    some methods specific to child classes. Create objects of child classes and
    store them into array. Loop through each object and execute available methods.
     */
    void internet(){
        System.out.println("can go to google.com");
    }
    void mouse(){
        System.out.println("uses mouse pad");
    }
    void system(){
        System.out.println("can use a desktop");
    }
    void media(){
        System.out.println("can view pictures");
    }
}
class Apple extends Computer{

    @Override
    void internet() {
        System.out.println("can use Safari");
    }
}
class Lenovo extends Computer{
    @Override
    void internet() {
        System.out.println("can use Chrome");
    }

    @Override
    void mouse() {
        System.out.println("can use mouse");
    }
}
class HP extends Computer{
    @Override
    void internet() {
        System.out.println("can use Edge");
    }

    @Override
    void system() {
        System.out.println("can use laptop");
    }
}
class Dell extends Computer{
    @Override
    void internet() {
        System.out.println("can use FireFox");
    }

    @Override
    void media() {
        System.out.println("can watch videos");
    }
}