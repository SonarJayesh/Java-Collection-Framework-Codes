package Collection_Framework;

import java.util.LinkedHashSet;

public class LinkedHashSet_Loop {
    public static void main(String[] args) {
        
    
        LinkedHashSet<String> studName = new LinkedHashSet<String>();

        studName.add("Jayesh");
        studName.add("Shubham");
        studName.add("Ritesh");
        studName.add("Ishwar");
        studName.add("Jayesh");

        for (String str : studName) {

            System.out.println(str);
        }
    }
}
