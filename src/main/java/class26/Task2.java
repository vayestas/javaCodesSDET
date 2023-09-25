package class26;

import java.util.TreeMap;

public class Task2 {
    /*
    Create a map of countries(5) with its capital that will store
    countries in alphabetical order. Country names will be keys and
    capitals will be values. Print all keys and values from a country
    map using for each loop or Lambda. Print all values from a country
    map using for each loop or Lambda.
     */
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("Italy","Rome");
        countries.put("Spain","Madrid");
        countries.put("Colombia","Bogota");
        countries.put("Portugal","Lisbon");
        System.out.println(countries);
        countries.forEach((k,v)-> System.out.println(k)); // lambda
        System.out.println("-----------");
        countries.forEach((k,v)-> System.out.println(v));

        System.out.println("--------");
        countries.forEach((k,v)->{
            if(k.length()>5 && v.contains("a")){ // prints words more than 5 letters & words with letters a
                System.out.println(k+" "+v);
            }
        });
    }
}
