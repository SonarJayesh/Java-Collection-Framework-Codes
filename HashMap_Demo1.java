package Collection_Framework;

import java.util.HashMap;

public class HashMap_Demo1 {
    public static void main(String[] args) {
        HashMap<Integer, String> studInfo = new HashMap<Integer, String>();

        studInfo.put(101, "Jayesh");
        studInfo.put(102, "Shubham");
        studInfo.put(103,"Ritesh");
        studInfo.put(104, "Ishwar");
        studInfo.put(105, "Umesh");
        studInfo.put(106, "Ishwar");

        System.out.println(studInfo);
    }
}
