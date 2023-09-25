package class4;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What amount is needed for loan?");
        int loanAmount=scanner.nextInt();
        if(loanAmount<=200000){
            System.out.println("loan approved");
        }else {
            System.out.println("loan rejected");
        }
    }
}
