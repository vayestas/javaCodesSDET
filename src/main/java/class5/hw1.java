package class5;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter a number");
        int num1=scanner.nextInt();
        System.out.println("Please enter another number");
        int num2=scanner.nextInt();
        System.out.println("Please enter operator");
        char operator=scanner.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;

        }

    }
}
