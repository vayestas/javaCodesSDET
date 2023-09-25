package class16;

public class CatTester {
    public static void main(String[] args) {
        Cat c1= new Cat("Lucy",33,200);
        c1.printInfo();

        Cat c2=new Cat("Ash",2,15,"grey");
        c2.printInfo();

        Cat c3=new Cat("Valkyrie",8,20,"Black",'F');
        c3.printInfo();
    }
}
