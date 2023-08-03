package class4;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your city");
        String city= scanner.nextLine();
        System.out.println("Enter the temperature");
        double temperature=scanner.nextDouble();
        double merge= (temperature-40)*2/8;
        System.out.println("The temperature in " +city+" "+" is "+merge);
    }
}
