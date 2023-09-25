package class17;

public class A {
    // multilevel inheritance
    String name;

    void printName(){
        System.out.println(name);
    }
}


class B extends A{
    String color;

    void printColor(){
        System.out.println(color);
    }
}

class C extends B{

    void printNameColor(){
        System.out.println(name+" "+color);
    }
}