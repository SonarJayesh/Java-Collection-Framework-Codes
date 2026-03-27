//Sort an ArrayList of Strings:

package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_String_sortMethod {
    public static void main(String[] args) {

        ArrayList<String> studName = new ArrayList<String>();

        studName.add("Umesh");
        studName.add("Jayesh");
        studName.add("Shubham");
        studName.add("Ritesh");
        Collections.sort(studName); // sort studName

        for (String i : studName) {
            System.out.println(i);
        }
        
    }
}
