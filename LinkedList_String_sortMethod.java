//Sort an ArrayList of Strings alphabetically in ascending order:

package Collection_Framework;

import java.util.Collections; // Import the Collections class
import java.util.LinkedList;

public class LinkedList_String_sortMethod {
    public static void main(String[] args) {
        
        LinkedList<String> studName = new LinkedList<String>();

        studName.add("Umesh");
        studName.add("Jayesh");
        studName.add("Shubham");
        studName.add("Ritesh");

        Collections.sort(studName);

        for (String str : studName) {
            System.out.println(str);
        }
    }
}
