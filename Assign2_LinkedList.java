// 2. Write a java program to read ‘n’ names of your friends, store it into linked list, also display contents of the same.

package Collection_Framework2;

import java.util.LinkedList;
import java.util.Scanner;

public class Assign2_LinkedList {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of Friends : ");
        int n = scanner.nextInt();
        
        LinkedList<String> llFriends = new LinkedList<String>();

        System.out.println("Enter Your Friend Names : ");
        for(int i=0; i<n; i++){

            String names = scanner.next();
            llFriends.add(names);

        }

        //Display Elements Using For Each Loop
        System.out.println("Your Friend Names :");
        for (String name : llFriends) {
            
            System.out.println(name);
        }

        

        System.out.println("Your Friend Names : "+ llFriends);

        scanner.close();

    }
}
