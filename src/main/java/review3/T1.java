package review3;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter first boolean value true/false");
        boolean value1=input.nextBoolean();
        System.out.println("Please enter second boolean value true/false");
        boolean value2=input.nextBoolean();

        System.out.println(value1&&value2);
        /*
        if(value1&&value2){
        System.out.println("Both values are true")"
        }else{
        System.out.println("Both values are not true")
         */

    }
}
