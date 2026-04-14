package Collection_Framework;

import java.util.TreeMap;

public class TreeMap_Loop {
    public static void main(String[] args) {
         
        TreeMap<String, String> capitalCities = new TreeMap<String, String>();
        
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        for (String str : capitalCities.keySet()) {
            System.out.println(str);
        }

        for (String string : capitalCities.keySet()) {
            
            System.out.println("Key: "+ string+ "\t Value: "+capitalCities.get(string));
        }
    }

}
