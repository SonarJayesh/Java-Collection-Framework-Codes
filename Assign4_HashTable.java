// 4. Create the hash table that will maintain the mobile number and student name. Display the contact list.

package Collection_Framework2;

import java.util.Hashtable;
import java.util.Scanner;

class Contact{
    String mNumber;
    String studName;

    public Contact(String mNumber, String studName){

        this.mNumber = mNumber;
        this.studName = studName;
    }

    @Override
    public String toString(){
        return "Name: "+studName+" Phone Number: "+mNumber;
    }
}
public class Assign4_HashTable {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Hashtable<String, Contact> hashTable = new Hashtable<String, Contact>();

        System.out.println("Enter the Number of Student :");
        int n = scanner.nextInt();

        for(int i =1; i<=n; i++){

            System.out.println("Enter the Student Name: "+i);
            String studName = scanner.next();

            System.out.println("Enter the mobile Number: "+i);
            String mNumber = scanner.next();

           

            hashTable.put(studName, new Contact(studName , mNumber));
            //hashTable.put(mNumber, studName);
        }

        System.out.println("Contact in the HashTable: ");
        System.out.println(hashTable);

        scanner.close();
    }
}
