package Collection_Framework;

import java.util.HashMap;

public class HashMap_Loop {
    public static void main(String[] args) {

        HashMap<Integer, String> studInfo = new HashMap<Integer, String>();

        studInfo.put(101, "Jayesh");
        studInfo.put(102, "Shubham");
        studInfo.put(103,"Ritesh");
        studInfo.put(104, "Ishwar");
        studInfo.put(105, "Umesh");
        studInfo.put(106, "Ishwar");

        for (Integer str : studInfo.keySet()) {
            System.out.println(str);
        }

        for(Integer i : studInfo.keySet()) {
            System.out.println("StudID: "+ i + "\t StudName: "+ studInfo.get(i));
        }
    }
}
