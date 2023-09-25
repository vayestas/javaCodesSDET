package class10;

public class E1StringDemo {
    public static void main(String[] args) {
        // we have created an object from the String class and have
        // stored Cat inside it.
        String obj=new String("Cat");
        // Shortcut to create ojbs from String class
        String obj2="My Dog"; // same as String obj2=new String("Dog")
        int len=obj.length();
        System.out.println(len); // answer is 3 b/c 3 letters in word Cat using length
    }
}
