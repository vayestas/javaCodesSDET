package class25;

import java.util.ArrayList;
import java.util.LinkedList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.remove(2);
        numbers.forEach(x-> System.out.println(x));

        LinkedList<Integer> num=new LinkedList<>();
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(12);
        num.removeIf(x->x>30); // removed if numbers greater than 30
        System.out.println(num);
    }
}
