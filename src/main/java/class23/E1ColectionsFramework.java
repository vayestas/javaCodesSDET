package class23;

import java.util.Arrays;

public class E1ColectionsFramework {
    public static void main(String[] args) {
        String [] arr=new String[10000]; // wastes memory
        arr[1] = "Fahim";
        System.out.println(Arrays.toString(arr));
    }
}
