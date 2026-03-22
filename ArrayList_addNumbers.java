//Create an ArrayList to store numbers (add elements of type Integer).

package Collection_Framework;

import java.util.ArrayList;

public class ArrayList_addNumbers {
    public static void main(String[] args) {
        
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        for (Integer i : myNumbers) {
            System.out.println(i);
        }
    }
}
