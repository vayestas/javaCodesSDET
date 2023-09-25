package project2;

public class P1 {
    /*
    Write a program to swap 2 String without
    a temporary variable?
     */
    public static void main(String[] args) {
        String word1 = "Hello";
        String word2 = "World";

        word1 = word1 + word2;
        word2 = word1.substring(0, word1.length() - word2.length());
        word1 = word1.substring(word2.length());

        System.out.println("str1: " + word1);
        System.out.println("str2: " + word2);
    }
}
