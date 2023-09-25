package class24;

import java.util.ArrayList;

public class T6 {
    /*
    Create an ArrayList of fruit then remove all the fruit
    which contains the letter a or ends with the letter e
     */
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("strawberry");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("peaches");
        fruits.add("kiwi");
        System.out.println(fruits);

        /*for (int i = 0; i < fruits.size(); i++) {

            if(fruits.get(i).contains("a")
                    ||fruits.get(i).endsWith("e")){
                fruits.remove(i);
            }
        }*/
        fruits.removeIf(x->x.contains("a") || x.endsWith("e"));
        System.out.println(fruits);
    }
}
