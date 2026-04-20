package Collection_Framework;

import java.util.TreeSet;

public class TreeSet_Methods {
    public static void main(String[] args) {
        TreeSet<String> studName = new TreeSet<String>();

        studName.add("Jayesh");
        studName.add("Shubham");
        studName.add("Ritesh");
        studName.add("Ishwar");
        studName.add("Jayesh");


        //Use contains() to check if an element exists:
        studName.contains("Jayesh");

        //Use size() to count how many unique elements are in the set:
        studName.size();

        //Use remove() to remove an element:
        studName.remove("Ritesh");

        //Use clear() to remove all elements:
        studName.clear();


    }
}
