package review8;

public class E3StaticVar {
    public static String country="USA";

    void printName(){
        System.out.println(country);
    }

    static void printCountry(){
        System.out.println(country);
    }

    public static void main(String[] args) {
        System.out.println(country);
    }
}
