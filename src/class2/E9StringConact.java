package class2;

public class E9StringConact {
    public static void main(String[] args) {
        //() is performed first /* then + and - when doing math
        System.out.println(2+2*2); //6
        System.out.println((2+2)*2); //8
        System.out.println("10"+10); //1010
        System.out.println("10"+10+10); //101010
        System.out.println("10"+(10+10)); //1020
        System.out.println("10"+10*10); //10100
    }
}
