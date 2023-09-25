package class26;

import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup=new TreeMap<>(); // alphabetically
        makeup.put("Lipsticks",22.0);
        makeup.put("Blush",40.0);
        makeup.put("Base",50.5);
        makeup.put("Foundation",90.5);
        makeup.put("Eyeliner",25.5);
        makeup.put("Concealer",35.5);
        makeup.put("Eyeliner",25.5);
        // prints both keys and values
        makeup.forEach((key,value)-> System.out.println(key+" "+value));
        // makeup.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("-----------------");
        // prints only keys
        makeup.forEach((key,value)-> System.out.println(key));
        System.out.println("-----------------");
        // prints only values
        makeup.forEach((key,value)-> System.out.println(value));
        System.out.println("-----------------");
        makeup.forEach((key,value)-> {
            if(key.contains("a")) {
                System.out.println(value);
            }
        });
    }
}
