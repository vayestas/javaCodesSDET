package class11;

public class Hw4 {
    public static void main(String[] args) {
        /*
        How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever

        How would you check if String is palindrome or not? aba=> true
        Abbc =>false
         */

        String str="This is sentence I want to reverse";

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
