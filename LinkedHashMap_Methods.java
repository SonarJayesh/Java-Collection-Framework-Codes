package Collection_Framework;

import java.util.LinkedHashMap;


public class LinkedHashMap_Methods {
    
     public static void main(String[] args) {
        
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<String, String>();
        
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        // Use get() with the key to access its value:
        capitalCities.get("India");
        System.out.println(capitalCities);

        // Use size() to count the number of key/value pairs:
        capitalCities.size();
        System.out.println(capitalCities);

        // Use remove() to delete a key/value pair by key:
        capitalCities.remove("USA");
        System.out.println(capitalCities);

        // Use clear() to remove all items:
        capitalCities.clear();
        System.out.println(capitalCities);

    }
}
