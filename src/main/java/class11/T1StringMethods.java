package class11;

public class T1StringMethods {
    //create String if the String is an odd number of characters and has 3 or more
    //characters, print the character in the middle of the String
    // example: String str="hello" => l

    public static void main(String[] args) {
        String str="Moons";

            if(str.length()%2!=0 && str.length()>=3){
                int middle=str.length()/2;// since str is odd letters can divide by 2
                System.out.println(str.charAt(middle));

            }

    }

}
