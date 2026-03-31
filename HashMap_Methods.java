package Collection_Framework;

import java.util.HashMap;

public class HashMap_Methods {
    public static void main(String[] args) {
        
        HashMap<Integer, String> studInfo = new HashMap<Integer, String>();

        studInfo.put(101, "Jayesh");
        studInfo.put(102, "Shubham");
        studInfo.put(103,"Ritesh");
        studInfo.put(104, "Ishwar");
        studInfo.put(105, "Umesh");
        studInfo.put(106, "Ishwar");

        // To access a value in the HashMap, use the get() method and refer to its key:
        studInfo.get(105);
        System.out.println(studInfo);

        // To find out how many items there are, use the size() method:
        studInfo.size();
        System.out.println(studInfo);

        // To remove an item, use the remove() method and refer to the key:
        studInfo.remove(106);
        System.out.println(studInfo);

        // To remove all items, use the clear() method:
        studInfo.clear();
        System.out.println(studInfo);

    }
}
