//Create a TreeMap that stores String keys and String values. and put() method used to add key/value pairs:
package Collection_Framework;

import java.util.TreeMap;

public class TreeMap_Demo1 { 
    
    public static void main(String[] args) {
        TreeMap<String, String> capitalCities = new TreeMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

     System.out.println(capitalCities);
    
    }
}
