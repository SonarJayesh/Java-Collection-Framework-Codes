//Create a LinkedHashMap object called capitalCities that will store String keys and String values

package Collection_Framework;

import java.util.LinkedHashMap;

public class LinkedHashMap_Demo1 {
     public static void main(String[] args) {
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

     System.out.println(capitalCities);
    
    }
}
