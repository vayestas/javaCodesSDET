package review2;

import java.util.Scanner;

public class E8CommonScannerIssues {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name");
        String fName=scanner.next();
        System.out.println("Please Enter your city");
        String city=scanner.nextLine();
        System.out.println(fName+" "+city);
    }
}
