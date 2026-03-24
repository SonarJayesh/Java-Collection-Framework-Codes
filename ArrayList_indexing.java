// You can also add an element at a specified position by referring to the index number:

package Collection_Framework;

import java.util.ArrayList;

public class ArrayList_indexing {
    
    public static void main(String[] args) {
        ArrayList<String> studName = new ArrayList<String>();
        studName.add("Jayesh");
        studName.add("Shubham");
        studName.add("Ritesh");

        studName.add(0, "Ishwar");
        System.out.println(studName);
        
    }
}
