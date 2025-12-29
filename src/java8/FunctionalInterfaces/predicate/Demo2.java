package java8.FunctionalInterfaces.predicate;

import java.util.function.Predicate;

public class Demo2 {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() >10;
        System.out.println(predicate.test("durga"));
        System.out.println(predicate.test("DurgaSoftwareSolutions"));
    }
}
