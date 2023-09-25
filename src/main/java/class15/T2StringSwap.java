package class15;

public class T2StringSwap {
    public static void main(String[] args) {
        String str1="Shawn";
        String str2="Pease";
        str1=str1+str2; //ShawnPease =10-5=5 0,5
        str2=str1.substring(0,str1.length()-str2.length());
        System.out.println(str2);
    }
}
