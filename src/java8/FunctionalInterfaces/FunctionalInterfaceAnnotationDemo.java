package java8.FunctionalInterfaces;

public class FunctionalInterfaceAnnotationDemo {
    public static void main(String[] args){

    }
}

@FunctionalInterface
interface Intref{
    public void m1();
    default void m2(){

    }
    public static void m3(){

    }
//    public void m2();
}
