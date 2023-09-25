package project2;

import java.util.ArrayList;

public class P7 {
    /*
     You have a list of strings, and you want to keep
     only those that start with “A” and you want to
     return them in lower case
     */
    public static void main(String[] args) {

        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Peach");
        System.out.println(fruits);

        ArrayList<String> lower=new ArrayList<>();

        for (int i = 0; i < fruits.size(); i++) {
            if(fruits.get(i).startsWith("A")){
                lower.add(fruits.get(i).toLowerCase());
            }
        }
        System.out.println(lower);

    }
}
