package class9;

public class T22DArrays {
    public static void main(String[] args) {
        // adding all elements
       int [][] numbers={
                {10,20,30,40},
                {15,30,35,45},
                {16,20,32,22}};

        for (int i = 0; i <= 3; i++) {
            System.out.println(numbers[2][i]); // row 0 colum 2 fixed
        }
    }
}
