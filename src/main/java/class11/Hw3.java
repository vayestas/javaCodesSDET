package class11;

public class Hw3 {
    public static void main(String[] args) {
        /*
        create a String that should be a combination of letters, numbers and special
        characters. Find out how many Alphabets (abd AZ) characters there are in the String
         */

        String str="feujd2235&*^%$2389IMNDY";

        System.out.println(str.replaceAll("[^a-zA-Z]","").length());

        }


    }

