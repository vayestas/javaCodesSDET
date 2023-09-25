package class7;

public class Hw9 {
    public static void main(String[] args) {
        int [] numbers={85,44,98,78,50};
        int largest=numbers[0];

        for (int i = 1; i <numbers.length; i++) {
            if(numbers[i]>largest){
                largest=numbers[i];
            }

        }System.out.println(largest);
    }
}
