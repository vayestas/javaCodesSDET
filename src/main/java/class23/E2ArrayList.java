package class23;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        ArrayList names=new ArrayList(); // creating an obj from the class
        names.add("Valeria"); // method
        names.add("Keith");
        names.add(10);
        names.add('F');
        System.out.println(names.size()); // prints number of methods - 4
        System.out.println(names);
        names.remove(0);
        System.out.println(names.size()); // prints 3
        System.out.println(names);

    }
}
