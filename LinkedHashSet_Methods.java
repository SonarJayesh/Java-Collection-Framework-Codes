package Collection_Framework;

import java.util.LinkedHashSet;

public class LinkedHashSet_Methods {
    public static void main(String[] args) {

        LinkedHashSet<String> studName = new LinkedHashSet<String>();

        studName.add("Jayesh");
        studName.add("Shubham");
        studName.add("Ritesh");
        studName.add("Ishwar");
        studName.add("Jayesh");

        // Use contains() to check for an element:
        studName.contains("Ishwar");
        System.out.println(studName);

        // Use remove() to remove an element:
        studName.remove("Ritesh");
        System.out.println(studName);

        // Use clear() to remove all elements:
        studName.clear();
        System.out.println(studName);
        
        // Use size() to count how many unique elements are in the set:
        studName.size();

        System.out.println(studName);

    }
}
