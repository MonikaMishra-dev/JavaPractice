package java8.FunctionalInterfaces.predicate;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = i->i>10;
        System.out.println(predicate.test(9));
        System.out.println(predicate.test(20));
        System.out.println(predicate.test(10));
    }
}
