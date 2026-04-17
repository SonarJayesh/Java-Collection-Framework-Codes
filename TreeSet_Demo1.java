//To add elements to a TreeSet, use the add() method.

package Collection_Framework;

import java.util.TreeSet;

public class TreeSet_Demo1 {
    public static void main(String[] args) {

        TreeSet<String> studName = new TreeSet<String>();

        studName.add("Jayesh");
        studName.add("Shubham");
        studName.add("Ritesh");
        studName.add("Ishwar");
        studName.add("Jayesh");

        System.out.println(studName);
        
    }
}
