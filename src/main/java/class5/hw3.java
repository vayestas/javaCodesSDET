package class5;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("What is your country?");
        String country=scanner.nextLine();
        System.out.println("What language do you speak?");
        String language=scanner.nextLine();
        System.out.println("Enter Grade A,B,C or D");
        String grade=scanner.nextLine();

        if(grade.equals("A")){
            System.out.println("A-Excellent");
        }else if(grade.equals("B")){
            System.out.println("B-Good");
        }else if(grade.equals("C")){
            System.out.println("C-Average");
        }else if(grade.equals("D")){
            System.out.println("D-Bad");
        }else{
            System.out.println("Not Acceptable");
        }

    }
}
