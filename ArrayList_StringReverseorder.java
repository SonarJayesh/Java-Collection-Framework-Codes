//sort an ArrayList of Strings alphabetically in reverse/descending order:

package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_StringReverseorder {
    
    public static void main(String[] args) {
    
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Collections.sort(cars, Collections.reverseOrder());// sort cars.

        for (String str : cars) {
            
            System.out.println(str);
        }
    }
}
