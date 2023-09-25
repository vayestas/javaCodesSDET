package review2;

import java.util.Scanner;

public class E7CommonScannerIssues {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("What city are you in?");
        String city=scanner.nextLine();
        System.out.println("What is the temperature in that city in farenheit?");
        double farenheit=scanner.nextDouble();
        double celsius=(farenheit-32);
    }
}
