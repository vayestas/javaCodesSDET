package class24;

import java.util.ArrayList;

public class Task3 {
    /*
    Create an arrayList of drinks & call it. If any drink
    has the letter "a" or "e" replace the whole word with water

     */
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Pepsi");
        drinks.add("V8");

        for (int i = 0; i < drinks.size(); i++) {

            if(drinks.get(i).contains("a")
                    || drinks.get(i).contains("e")){
                drinks.set(i,"water");
            }
        }

        System.out.println(drinks);
    }
}
