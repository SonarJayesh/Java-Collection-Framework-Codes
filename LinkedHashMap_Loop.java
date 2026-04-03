package Collection_Framework;

import java.util.LinkedHashMap;


public class LinkedHashMap_Loop {
    
    public static void main(String[] args) {
         
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<String, String>();
        
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }

        System.out.println("");
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

        System.out.println("");
        for (String string : capitalCities.keySet()) {
            
            System.out.println("Key: "+ string+ "\t Value: "+capitalCities.get(string));
        }
    }
}
