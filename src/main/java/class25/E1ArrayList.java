package class25;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        int [] arr=new int[5]; // array

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        numbers.add(50);
        numbers.add(12);
        System.out.println(numbers);
        numbers.remove(1); // removes 40
        System.out.println(numbers);
        numbers.removeIf(x->x>12); // lambda
        System.out.println(numbers);
    }
}