package java8.FunctionalInterfaces;

public class FunctionalInterfaceWRTInheritance {
    public static void main(String[] args){

    }
}

@FunctionalInterface
interface Parent{
    public void m1();
}

//@FunctionalInterface
//interface Child extends Parent{
//
//}

//@FunctionalInterface
//interface Child extends Parent{
//    public void m1();
//}

//@FunctionalInterface
//interface Child extends Parent{
//    public void m2();
//}

interface Child extends Parent{
    public void m2();
}
