//You can also loop through an ArrayList with the for-each loop:

package Collection_Framework;

import java.util.ArrayList;

public class ArrayList_foreach_loop {
    public static void main(String[] args) {
        ArrayList<String> studName = new ArrayList<String>();

        studName.add("Umesh");
        studName.add("Jayesh");
        studName.add("Shubham");
        studName.add("Ritesh");

        for(String i: studName){

            System.out.println(i);
        }
    }
}
