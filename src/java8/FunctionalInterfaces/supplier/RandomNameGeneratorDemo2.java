package java8.FunctionalInterfaces.supplier;

import java.util.function.Supplier;

public class RandomNameGeneratorDemo2 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            String[] s ={"Monika","Avinash","Ashutosh","Aman","Vaani","Shreeda"};
            int x = (int)(Math.random() * 6);
            return s[x];
        };
        System.out.println(supplier.get());
    }
}
