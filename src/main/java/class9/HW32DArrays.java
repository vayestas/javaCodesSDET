package class9;

public class HW32DArrays {
    public static void main(String[] args) {
        //print out only even numbers

        int [][] nums={ {33,56,22,66},
                        {20,79,88,97},
                        {15,54,32,31}};

        for (int [] row:nums){
            for (int numbers:row){
                if(numbers%2==0){
                    System.out.print(numbers+" ");
                }
            }
        }


    }
}
