package class24;

import java.util.ArrayList;

public class Task2 {
    /*
    Create an Arraylist of cars and retrieve all the
    values using 2 different ways
     */
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Chevy");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Jeep");

        System.out.println(cars);
        System.out.println("*****************");

        for(String c:cars){
            System.out.println(c);
        }
    }
}
