package class5;
/*
write a program for user to enter his/hers birth month. Based on the month define the season.
example: if user is born in Mar, Apr, May - season="Spring"
if user is born in June, July, Aug - season="summer"
At the end of program we should see "You were born in ____" ---(||) means OR
 */
import java.util.Scanner;

public class T1OROperator {
    public static void main(String[] args) {

        Scanner month=new Scanner(System.in);

        System.out.println("Enter your birth month");
        String birthMonth=month.next();
        if(     birthMonth.equalsIgnoreCase("Mar")||
                birthMonth.equalsIgnoreCase("Apr")||
                birthMonth.equalsIgnoreCase("May")){
            System.out.println("Spring");
        }else if (birthMonth.equalsIgnoreCase("Jun")||
                birthMonth.equalsIgnoreCase("Jul")||
                birthMonth.equalsIgnoreCase("Aug")){
            System.out.println("Summer");
        }

        }

    }

