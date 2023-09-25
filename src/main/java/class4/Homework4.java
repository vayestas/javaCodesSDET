package class4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a credit card? Yes or No");
        String creditCard=scanner.next();

        if(creditCard.equals("No")){
            System.out.println("We'd like to offer you one");
        }else{
            System.out.println("What is the balance on the card?");
            int balance= scanner.nextInt();
            if(balance>1000){
                System.out.println("Pay off Immediately");
            }else{
                System.out.println("You can spend more.");
            }
        }
    }
}
