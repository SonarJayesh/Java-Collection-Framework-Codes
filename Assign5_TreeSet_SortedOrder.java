// 5. Accept 'n' integers from the user. Store and display integers in sorted order having proper collection class. 

package Collection_Framework2;

import java.util.Scanner;
import java.util.TreeSet;

public class Assign5_TreeSet_SortedOrder {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter How many Number Entered: ");
        int n = scanner.nextInt();

        TreeSet<Integer> tSet = new TreeSet<Integer>();
        
        System.out.println("Enter the Numbers");
        for(int i=0; i<n; i++){
            int num = scanner.nextInt();
            tSet.add(num);
        }

        System.out.println("Sorted Numbers and Without Duplication: ");
        System.out.println(tSet);

        scanner.close();
        
    }
}
