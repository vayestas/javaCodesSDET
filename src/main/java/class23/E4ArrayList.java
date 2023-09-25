package class23;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList <String> arr=new ArrayList();
        arr.add("Ace");
        // arr.add(25); only allows specified String
        arr.add("Howard");
        arr.add("Justin");
        System.out.println(arr.get(0)); // prints Ace
        System.out.println(arr.get(2)); // prints Justin
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains("sdsd"));
        System.out.println(arr.indexOf("Howard"));
    }
}
