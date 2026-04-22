// 3. Write a program to create a new tree set, add some colors (string) and print out the tree set.

package Collection_Framework2;

import java.util.Scanner;
import java.util.TreeSet;

public class Assign3_TreeSet {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeSet<String> tsColors = new TreeSet<String>();

        System.out.println("Enter How Many Colors: ");
        int n = scanner.nextInt();

        System.out.println("Enter the Color Names: ");
        for(int i=0 ; i<n; i++ ){

            String colour = scanner.next();
            tsColors.add(colour); 
        }

        System.out.println("Colour Tree Set: "+tsColors);

        scanner.close();
    }
}
