package project2;

public class P3 {
    /*
    Check if a String is Palindrome: Determine whether a
    given string is a palindrome, which means it reads
    the same forwards and backward. For example, "madam"
    is a palindrome.
     */
    public static void main(String[] args) {
        String word="racecar";
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse += word.charAt(i);
        }
        boolean palindrome=true;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) != reverse.charAt(i)){
                palindrome=false;
            }
        }
        if(palindrome){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
