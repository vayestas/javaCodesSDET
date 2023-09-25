package class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E6Maps {
    // nested array list into a map
    public static void main(String[] args) {

        ArrayList<Double> priceOfMakeup=new ArrayList<>();
        priceOfMakeup.add(25.5);
        priceOfMakeup.add(30.2);
        priceOfMakeup.add(25.2);

        ArrayList<Double> pricesOfFruit=new ArrayList<>();
        pricesOfFruit.add(2.5);
        pricesOfFruit.add(3.99);
        pricesOfFruit.add(4.99);

        ArrayList<Double> pricesOfDairy=new ArrayList<>();
        pricesOfDairy.add(1.99);
        pricesOfDairy.add(2.99);
        pricesOfDairy.add(3.99);
        pricesOfDairy.add(4.99);

        Map<String,ArrayList<Double>> arrayListMap=new HashMap<>(); // nested array list into a map
        arrayListMap.put("priceOfMakeup",priceOfMakeup);
        arrayListMap.put("priceOfFruit",pricesOfFruit);
        arrayListMap.put("priceOfDairy",pricesOfDairy);
    }
}
