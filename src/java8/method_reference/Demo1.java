package java8.method_reference;

interface Intref{
    public void m1();
}

public class Demo1 {
    public static void m2(){
        System.out.println("Method reference implementation");
    }
    public static void main(String[] args) {
//        Intref i = ()->System.out.println("Lambda Implementation");
//        i.m1();
        Intref i = Demo1 :: m2;
        i.m1();

    }
}
