package Collection_Framework2;

import java.lang.Runnable;
class A implements Runnable{
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("\t Thread A :"+i);
        }
        System.out.println("End of Thread ");
    }
}

public class Assign8_RunableInterface {
    public static void main(String[] args) {
        A R = new A();
        Thread T = new Thread(R);
        T.start();
    }
}
