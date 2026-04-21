//1.Write a java program to accept names of ‘n’ cities, insert same into array list collection and display the contents of same array list, also remove all these elements.

package Collection_Framework2;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign1_ArrayList {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of Cities :");
        int nCity = scanner.nextInt();

        ArrayList<String> alCities = new ArrayList<String>();
        
        System.out.println("Enter the Name of Cities :");
        for(int i = 0; i<nCity; i++){

            String city = scanner.next();
            alCities.add(city);
        }

        System.out.println("Cities : "+alCities);

        System.out.println("After Removing the Element of ArrayList : ");
        alCities.clear();

        scanner.close();
    }
}
