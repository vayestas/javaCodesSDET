package class12;

public class T1Methods {

    /*
    create a method that will take 2 parameters as
    numbers and prints which number is larger
     */
        void printLarger (int num1,int num2) {


            if (num1 > num2) {
                System.out.println(num1 + " is the larger number");
            } else if (num2 > num1) {
                System.out.println(num2 + " is the larger number");
            }else{
                System.out.println("invalid");
            }
        }

        /*
        create a method that will take a number and print
        whether the number is even or odd
         */

        void checkEvenOdd(int num){

            if(num%2==0){
                System.out.println(num+" is an even number");
            }else {
                System.out.println(num+" is an odd number");
            }


        }

}
