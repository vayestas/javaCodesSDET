package class4;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of worked years");
        int years=scanner.nextInt();

        System.out.println("Enter annual salary");
        double salary=scanner.nextDouble();
        if(years>=5){
            System.out.println("Employee is eligible for a bonus");

            if(salary>=50000){
                System.out.println("Bonus will be 5000");
            }else{
                System.out.println("Bonus will be 3000");
            }
        }else{
            System.out.println("You are not elegibe for bonus");
        }
    }
}
