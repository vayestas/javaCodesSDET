package class18;

public class CarTester {
    public static void main(String[] args) {

        BMW i8=new BMW("BMW","i8",
                80000,"Black");

        i8.printInfo();

        Audi a=new Audi("Audi","Etron",60000,"White",true);
        a.printInfo();
    }
}
