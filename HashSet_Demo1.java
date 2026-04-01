//To add elements to a HashSet, use the add() method:

package Collection_Framework;

import java.util.HashSet;

public class HashSet_Demo1 {
    public static void main(String[] args) {
        HashSet<String> studName = new HashSet<String>();

        studName.add("Jayesh");
        studName.add("Shubham");
        studName.add("Ritesh");
        studName.add("Ishwar");
        studName.add("Shubham");

        System.out.println(studName);
    }
}
