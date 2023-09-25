package class25;

import java.util.LinkedHashSet;

public class E8sets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> uniqueNumbers=new LinkedHashSet<>();
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(10);
        uniqueNumbers.add(30);
        System.out.println(uniqueNumbers);
    }
}
