package class24;

import java.util.ArrayList;

public class Task1 {
    /*
    Create an ArrayList that will store 5 names into it
    -Find out whether the given ArrayList is empty or not
    -Check whether specific name is present in an ArrayList or not
    -Find the size of your ArrayList and print all
    values from that
     */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Valeria");
        names.add("John");
        names.add("Jacob");
        names.add("Steven");
        names.add("Jen");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("John"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
