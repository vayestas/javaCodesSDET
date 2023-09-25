package class17;

public class X {
    String name;

    void printName(){
        System.out.println(name);
    }
}

class Y extends X{
    String address;

    void printAddress(){
        System.out.println(address);
    }
}

class Z extends Y{
    int age;

    void printAll(){
        System.out.println(age+" "+address+" "+age);
    }
}