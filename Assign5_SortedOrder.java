// 5.Accept 'n' integers from the user. Store and display integers in sorted order having proper collection class. 

package Collection_Framework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assign5_SortedOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("Enter the Hoe Many Numbers: ");
        int n = scanner.nextInt();

        System.out.println("Enter the Number");
        for(int i=0 ;i<n; i++){

            int num = scanner.nextInt();
            arrayList.add(num);
        }
        Collections.sort(arrayList);

        System.out.println("Sorted Order: \n");
        for (Integer Sorted : arrayList) {
         
            System.out.println(Sorted);

        }
        
        scanner.close();
    }
}
