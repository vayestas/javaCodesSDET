package class26;

import java.util.Collection;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {

        TreeMap<String, Double> makeup=new TreeMap<>(); // alphabetically
        makeup.put("Lipstiks",22.0);
        makeup.put("Blush",40.0);
        makeup.put("Base",50.5);
        makeup.put("Foundation",90.5);
        makeup.put("Eyeliner",25.5);
        makeup.put("Concealer",35.5);
        makeup.put("Eyeliner",25.5);
        System.out.println(makeup);
        Collection<String> onlyKeys=makeup.keySet(); // only the keys will print - lipstick, blush, base
        Collection<Double> onlyValues=makeup.values(); // only the values will print - 40.0
        System.out.println(onlyKeys);
        System.out.println(onlyValues);
    }
}
