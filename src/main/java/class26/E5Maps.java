package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E5Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup=new TreeMap<>(); // alphabetically
        makeup.put("Lipsticks",22.0);
        makeup.put("Blush",40.0);
        makeup.put("Base",50.5);
        makeup.put("Foundation",90.5);
        makeup.put("Eyeliner",25.5);
        makeup.put("Concealer",35.5);
        makeup.put("Eyeliner",25.5);

        Set< Map.Entry<String,Double>> entries= makeup.entrySet(); // for loop
        for(Map.Entry<String,Double> e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
