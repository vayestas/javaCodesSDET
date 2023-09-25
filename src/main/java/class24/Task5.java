package class24;

import java.util.ArrayList;

public class Task5 {
    /*
    Create an arraylist of even numbers from 1 to 500
    Remove any number that is divisible by 5
    from that array list
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();

        for (int i = 2; i <=500 ; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        /*for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)%5==0){
                numbers.remove(i);
            }
        }*/
        numbers.removeIf(x->x%5==0);
        System.out.println(numbers);
    }
}
