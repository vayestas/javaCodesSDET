package class10;

public class E3StringDemo {
    public static void main(String[] args) {

        String name="MADINA";

        System.out.println(name.toLowerCase());// prints all letters to lower case
        System.out.println(name); // will still print all upper
        name=name.toLowerCase(); // reassigning name to always show lower case
        System.out.println(name);
    }

}
