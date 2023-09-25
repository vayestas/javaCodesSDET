package class9;

public class T32DArrays {
    public static void main(String[] args) {
        // adding all elements
       int [][] numbers={
                {10,20,30,40,50},
                {15,30,35,45,20},
                {16,20,32,22,30}};

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[1][i]); // row 0 colum 2 fixed
        }
    }
}
