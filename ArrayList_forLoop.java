//Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run.

package Collection_Framework;
import java.util.ArrayList;

public class ArrayList_forLoop {
    public static void main(String[] args) {
        
        ArrayList<String> studName = new ArrayList<String>();

        studName.add("Umesh");
        studName.add("Jayesh");
        studName.add("Shubham");
        studName.add("Ritesh");

        for(int i = 0; i<studName.size();i++){

            System.out.println(studName.get(i));
        }

    }
}
