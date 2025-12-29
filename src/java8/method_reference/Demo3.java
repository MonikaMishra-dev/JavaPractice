package java8.method_reference;

class Sample{
    Sample(){
        System.out.println("Sample Construtor");
    }
}
interface Intref1{
     Sample get();
}
public class Demo3 {
    public static void main(String[] args) {
        Intref1 i = Sample :: new;
        Sample s = i.get();
        System.out.println(s);
    }
}
