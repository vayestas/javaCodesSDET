package class26;

import java.util.TreeMap;

public class E11Maps {
    public static void main(String[] args) {

    TreeMap<String, Double> makeup = new TreeMap<>();
    // alphabetically
        makeup.put("Lipsticks",22.0);
        makeup.put("Blush",40.0);
        makeup.put("Base",50.5);
        makeup.put("Foundation",90.5);
        makeup.put("Eyeliner",25.5);
        makeup.put("Concealer",35.5);
        makeup.put("Eyeliner",25.5);
        // removes all keys that contain the letter a
        //makeup.entrySet().removeIf(x-> x.getKey().contains("a"));
        //makeup.entrySet().removeIf(x->x.getValue()>30); // removes all values greater than 30
        makeup.entrySet().removeIf(x-> x.getKey().contains("a") && x.getValue()>30); // together
        System.out.println(makeup);

}
}
