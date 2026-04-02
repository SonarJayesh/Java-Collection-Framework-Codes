package Collection_Framework;

import java.util.HashSet;

public class HashSet_findPresentNumber {
    
    public static void main(String[] args) {

        // Create a HashSet object called numbers
        HashSet<Integer> myNumber = new HashSet<Integer>();

        // Add values to the set
        myNumber.add(4);
        myNumber.add(7);
        myNumber.add(8);

        // Show which numbers between 1 and 10 are in the set

        for(int i=1; i<=10; i++){
            if (myNumber.contains(i)) {
                System.out.println(i +" was found in the Set.");
            }
            else
            {
                System.out.println(i + " was not found in the set.");
            }
        }

    }
}
