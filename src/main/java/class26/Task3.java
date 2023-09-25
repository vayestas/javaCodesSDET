package class26;

import java.util.LinkedHashMap;

public class Task3 {
    /*
    Create a Map of Best Buy store. Place item id and
    item name into it. Example
    (7664847 = Printer, 7879885= Tv etc)
    Retrieve all keys and values from a Best Buy
    map using EntrySet
     */
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> bestBuy=new LinkedHashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7879885,"TV");
        bestBuy.put(6521415,"Speakers");
        bestBuy.put(0021736,"Stove");
        bestBuy.put(4286356,"Refrigerator");

        var entries=bestBuy.entrySet();
        for(var e:entries){
            System.out.println(e.getKey()+" "+e.getValue());
        }



    }
}
