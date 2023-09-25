package class11;

public class E3StringMethods {
    public static void main(String[] args) {
        // write code that will count how many times the letter (a) has appeared
        // in the String

        String str="Batch 17 is great.";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                count++;
            }

        }
        System.out.println(count);
    }
}
