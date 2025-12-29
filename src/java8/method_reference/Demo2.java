package java8.method_reference;

public class Demo2 {
    public void m1(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
       Runnable r =  obj :: m1;
       Thread t = new Thread(r);
       t.start();
       for(int i=0;i<10;i++){
           System.out.println("Main Thread");
       }
    }
}
