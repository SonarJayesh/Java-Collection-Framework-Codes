/*
    6.Write a Java program that performs the following set operations:
        1.Union (A ∪ B): Combine all elements from two sets, eliminating duplicates.
        2.Intersection (A ∩ B): Find the common elements between two sets.
        3.Complement (A - B): Find the elements that are present in set A but not in set B.
        4.Complement (B - A): Find the elements that are present in set B but not in set A.
*/

package Collection_Framework2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Assign6_SetOperations {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        Set<Integer> setA = new HashSet<Integer>();
        Set<Integer> setB = new HashSet<Integer>();

        System.out.println("Enter the How Many Elements of Set A: ");
        int numA = scanner.nextInt();

        System.out.println("Enter the Set A Elements: ");
        for(int i=0; i<numA; i++){
            int elementsA = scanner.nextInt();
            setA.add(elementsA);
        }

        System.out.println("Enter the How Many Elements of Set B: ");
        int numB = scanner.nextInt();

        System.out.println("Enter the Set B Elements: ");
        for(int i=0; i<numB; i++){
            int elementsB = scanner.nextInt();
            setB.add(elementsB);
        }

        Set<Integer> setUnion = new HashSet<>(setA);
        setUnion.addAll(setB);
        System.out.println("Union (A U B): "+setUnion);

        Set<Integer> setIntersection = new HashSet<>(setA);
        setIntersection.retainAll(setB);
        System.out.println("Intersection (A ∩ B): "+setIntersection);

        Set<Integer> complementSetA = new HashSet<>(setA);
        complementSetA.removeAll(setB);
        System.out.println("Complement (A - B): "+complementSetA);

        Set<Integer> complementSetB = new HashSet<>(setB);
        complementSetB.removeAll(setB);
        System.out.println("Complement (B - A): "+complementSetB);


        scanner.close();
    }
}
