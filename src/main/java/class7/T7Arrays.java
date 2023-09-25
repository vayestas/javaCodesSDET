package class7;

public class T7Arrays {
    /*
    Add all the numbers from the array and print the sum at the end
     */
    public static void main(String[] args) {

        int [] numbers={20,10,50,30,40};// 150

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
