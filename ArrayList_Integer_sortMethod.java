package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_Integer_sortMethod {
    public static void main(String[] args) {

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(25);
        myNumbers.add(1);
        myNumbers.add(10);
        myNumbers.add(25);

        Collections.sort(myNumbers);
        for (Integer i : myNumbers) {
            System.out.println(i);
        }
    }
}
