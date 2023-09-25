package class24;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Valeria");
        names.add("John");
        names.add("Jacob");
        names.add("Steven");
        names.add("Jen");
        for (int i = 0; i < names.size(); i++) { // for loop
            System.out.println(names.get(i));
        }
        System.out.println("****************");
        for(String n:names){            // enhanced for loop
            System.out.println(n);
        }
        System.out.println("***************");

        int i=0;
        while(i<names.size()){          // while loop
            System.out.println(names.get(i));
            i++;
        }
    }
}
