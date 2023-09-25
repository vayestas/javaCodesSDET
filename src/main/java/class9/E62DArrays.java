package class9;

public class E62DArrays {
    public static void main(String[] args) {
        // adding all elements
       int [][] numbers={
                {10,20,30,40},
                {15,30,35,45},
                {16,20,32,22}};

        for (int row = 0; row < numbers.length; row++) { // can replace numbers.length with 4 to get all
            System.out.println(numbers[1][row]);
        }
    }
}
