//To add elements to an ArrayList, use the add() method:

package Collection_Framework;
import java.util.ArrayList;

public class ArrayListDemo1{
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Defender");

        System.out.println(cars);
    }
   
}

