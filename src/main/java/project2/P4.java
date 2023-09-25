package project2;

public class P4 {
    /*
    Count the Number of Words in a String: Write a function
    to count the number of words in a given string. Words
    are separated by spaces or punctuation. For example,
    the input "Hello, world!" should return 2.
     */
    public static void main(String[] args) {
        String words="Hello, world!";
        String [] word= words.split(",");
        System.out.println(word.length);




    }
}
