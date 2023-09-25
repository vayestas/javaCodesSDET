package class5;

import java.util.Scanner;
/*
Ask the user to enter their country and capture it.
Once values are captured print which language user speaks.
 */
public class T1Switch {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your country");

        String country=input.nextLine();
        switch (country){
            case "Italy":
                System.out.println("Speak Italian");
                break;
            case "France":
                System.out.println("Speak French");
                break;
            case "Brazil":
                System.out.println("Speak Portuguese");
            case "China":
                System.out.println("Speak Mandarin");
            case "Spain":
                System.out.println("Speak Spanish");
            default:
                System.out.println("Country not supported");

        }
    }
}
