package Collection_Framework;

import java.util.ArrayList;

public class ArrayList_Methoda {
    public static void main(String[] args) {
        ArrayList<String> studName = new ArrayList<String>();

        studName.add("Umesh");
        studName.add("Jayesh");
        studName.add("Shubham");
        studName.add("Ritesh");

        studName.add(1, "Darshan");
        System.out.println(studName);

        String stud1 =studName.get(0);
        System.out.println(stud1);

        String stud2 = studName.set(2, "Mahesh");
        System.out.println(stud2);

        String stud3 = studName.remove(3);
        System.out.println(stud3);
    }
}
