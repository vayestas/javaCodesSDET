package class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class E9Maps {
    public static void main(String[] args) {

        Set<String> s=new LinkedHashSet<>();

        Integer i=new Integer(10);
        String name=new String("Titu");
        s.add(name);

        Set<ArrayList<String>> test=new LinkedHashSet<>();
        String name2="James";
        // test.add(name2)
        ArrayList<Integer> numbers=new ArrayList<>();
        Integer g=10;
        // test.add(numbers)
        ArrayList<String> j=new ArrayList<>();
        test.add(j); // same data type - string & arrayList of String
    }
}
