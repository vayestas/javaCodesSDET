package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Name");
        String name=scanner.next();
        if(name.equals("Jamil")){
            System.out.println("Senior SDET in 2 years");
        }else if(name.equals("Ayesha")){
            System.out.println("I live in Canada");
        }else if(name.equals("Habib")){
            System.out.println("Jailed by wife");
        }else if(name.equals("Giulia")){
            System.out.println("Dental Assistant");
        }else if(name.equals("Stephanie")){
            System.out.println("Works for hospital");
        }
    }
}
