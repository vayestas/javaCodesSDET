package review5;

public class ArrayReview {
    public static void main(String[] args) {
        int a=10;

        int[] array={10,11,12,13,55,34,24};

        int numberOfElements=array.length;
        System.out.println(numberOfElements);// prints out how many elements there are - 7

        System.out.println(array[3]);// getting one element from array - 13

        /*
        when to use loops - when we want to repeat a block of code
        when we do not know the exact number of iterations - while or do while
        when we know how many times we want to repeat or iterate the code - for loop
         */

        for(int i=0; i<array.length;i++){
            System.out.println(array[i]+" ");// prints all numbers
        }

        for(int ar:array){
            System.out.println(ar);
        }

    }
}
