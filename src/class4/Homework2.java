package class4;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter you age");
        int age=scanner.nextInt();
        if(age>18){
            System.out.println("Drivers license issued");
        }else{
            System.out.println("Get a learners permit");
        }
    }
}
