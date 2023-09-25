package class5;

import java.util.Scanner;
/*
Prompt the user to enter person height in inches. Person should be classified as one of
the following:
short (under 60 inch)
medium (between 60-72 inch)
tall (over 72inch)
 */
public class T2ANDOROperator {
    public static void main(String[] args) {

        System.out.println("What is your height?");
        Scanner input=new Scanner(System.in);

        double height=input.nextDouble();
        if(height<60){
            System.out.println("You are short");
        }else if(height>=60 && height<=72){
            System.out.println("You are medium");
        }else if(height<72){
            System.out.println("You are tall");
        }


    }
}
