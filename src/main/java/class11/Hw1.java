package class11;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        /*
        Write a program that reads two people's first names and if they are expecting
        boy or girl? Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter Mom's first name: ");
        String momName=scanner.nextLine();

        System.out.println("Please enter Dad's first name: ");
        String dadName=scanner.nextLine();

        System.out.println("Baby boy or girl?");
        String gender=scanner.nextLine();

        String midMom=momName.substring(0,momName.length()/2);
        String midDad=dadName.substring(dadName.length()/2);

        if(gender.equals("boy")){
            String boysName=dadName.substring(dadName.length()/2)+momName.substring(0,momName.length()/2);
            System.out.println(boysName);
        }else if(gender.equals("girl")){
            String girlsName=momName.substring(0,momName.length()/2)+dadName.substring(dadName.length()/2);
            System.out.println(girlsName);
        }else{
            System.out.println("Invalid input");
        }


    }
}

