package class25;

import java.util.LinkedHashSet;

public class Task3 {
    /*
    Create a set of cities in which you want to
    make sure the insertion order is maintained.
    Then remove any city that starts with "A"
     */
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Italy");
        cities.add("Toronto");
        cities.add("DC");
        cities.add("Agraba");
        cities.add("San Francisco");
        System.out.println(cities);

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);

    }
}
