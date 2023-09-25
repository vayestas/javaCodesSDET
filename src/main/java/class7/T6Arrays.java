package class7;

public class T6Arrays {
    /*
    create an array store 5 numbers in it and print all the numbers
    from the array
     */
    public static void main(String[] args) {

        int [] numbers={20,24,48,69,60};//now print only 20,48,80

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if(numbers[i]%2==0){
                System.out.println(numbers[i]);
            }

        }

    }
}
