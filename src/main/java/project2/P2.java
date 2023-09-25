package project2;

public class P2 {
    /*
    Reverse a String: Write a function to reverse a
    given string. For example, given the input "Hello",
    the output should be "olleH".
     */
    public static void main(String[] args) {
        String word1="Hello";
        String result="";

        for (int i = word1.length()-1; i >=0 ; i--)
            result+= word1.charAt(i);

            System.out.println(result);

    }
}
