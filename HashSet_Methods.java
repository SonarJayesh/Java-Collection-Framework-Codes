

package Collection_Framework;

import java.util.HashSet;

public class HashSet_Methods {
    public static void main(String[] args) {
    
        HashSet<String> studName = new HashSet<String>();

            studName.add("Jayesh");
            studName.add("Shubham");
            studName.add("Ritesh");
            studName.add("Ishwar");
            studName.add("Shubham");

            System.out.println(studName);

             studName.contains("Ritesh");

             studName.remove("Ishwar");

             studName.clear();

             studName.size();

             System.out.println(studName);

    }       
}
