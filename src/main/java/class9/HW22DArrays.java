package class9;

public class HW22DArrays {
    public static void main(String[] args) {
        // adding all elements
       int [][] numbers={
                {55,20,30,76},
                {60,22,18,55},
                {45,88,70,22}};

       int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum=sum+numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}
