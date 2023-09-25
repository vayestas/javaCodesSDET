package class5;

import java.util.Scanner;

public class T2Switch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please Enter quiz score");
        int quizScore=input.nextInt();
        int midTermScore=input.nextInt();
        int finalsScore=input.nextInt();
        if(quizScore>=90){
            System.out.println("Grade A- Excellent");
        }else if(midTermScore>=70 && midTermScore<90){
            System.out.println("Grade B- Good");
        }else if(finalsScore>=50 && finalsScore<70){
            System.out.println("Grade C- Average");
        }else if(input.nextInt()<50){
            System.out.println("Grade D- Low");
        }else{
            System.out.println("Grade F- Bad");
        }

    }
}
