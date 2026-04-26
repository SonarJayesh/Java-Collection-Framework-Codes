// 7. Write a program to implement the concept of threading by extending Thread Class.

package Collection_Framework2;

class A extends Thread{

    public void run(){
        System.out.println("Thread A is Started ");
        for(int i=1; i<=5; i++){
            System.out.println("\t from Thread A :i"+i);
        }
        System.out.println("Thread A is Exit");
    }
}

class B extends Thread{

    public void run(){
        System.out.println("Thread B is Started: ");
        for(int j=1; j<=5; j++){
            System.out.println("\t From Thread B :j"+j);
        }
        System.out.println("Thread B is Exit");
    }
}
class C extends Thread{

    public void run(){
        System.out.println("Thread C is Started ");
        for(int k =1; k<=5; k++){
            System.out.println("\t From Thread C : i"+k);
        }
        System.out.println("Thread C is Exit");
    }
} 

public class Assign7_Threading_ThreadClass {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}
