package review10;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        // cat act=
        String s1="Cat";
        String s2="Act";

        char[] c1=s1.toLowerCase().toCharArray(); // {c,a,t}
        char[] c2=s2.toLowerCase().toCharArray();// {a,c,t}
        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean isAnaGram= Arrays.equals(c1,c2);
        System.out.println(isAnaGram);
    }
}
