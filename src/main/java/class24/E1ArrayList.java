package class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Valeria");
        names.add("John");
        names.add("Jacob");
        names.add("Steven");
        names.add("Jen");
        //names.remove(0); same as bellow
        names.remove("Valeria");
        System.out.println(names);
        names.add(2,"Carol");
        System.out.println(names);
        names.set(1,"Zackery"); // to replace
        System.out.println(names);

    }
}
