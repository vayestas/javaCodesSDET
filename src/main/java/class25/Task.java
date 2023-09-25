package class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("James");
        names.add("Jasmine");
        names.add("Jane");
        names.add("James");
        System.out.println(names);

        LinkedHashSet<String> n=new LinkedHashSet<>();

        names.clear();
        names.addAll(n);
        System.out.println(names);

    }
}
