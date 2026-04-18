package Collection_Framework;

import java.util.TreeSet;

public class TreeSet_Loop {
    public static void main(String[] args) {
        
        TreeSet<String> studName = new TreeSet<String>();

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
