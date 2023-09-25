package class9;

public class E42DArrays {
    public static void main(String[] args) {

       int [][] numbers={
                {10,20,30,40},
                {100,200,300,400},
                {15,25,35,45}};

        for (int row = 0; row < 3; row++) { // can replace 3 with numbers.length
            for (int col = 0; col < 4; col++) { // can replace 4 with numbers[row].length
                System.out.print(numbers[row][col]+" ");
            }
            System.out.println();

        }

    }
}
