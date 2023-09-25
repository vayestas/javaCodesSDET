package class26;

import java.util.LinkedHashMap;

public class Task {
    /*
    Create a map of a building. Store floor number and its
    associated company name. (Example: 1= Google, 2=Syntax etc..).
    Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
     */
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> building=new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Microsoft");
        building.put(4, "Best Buy");
        building.put(5, "Best Buy");
        building.put(6, "Ikea");
        building.put(7, "Apple");
        System.out.println(building);
        System.out.println(building.size());
        building.replace(4,"HP");
        building.remove(7);
        System.out.println(building);


    }
}
