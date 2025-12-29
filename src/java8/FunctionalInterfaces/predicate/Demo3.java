package java8.FunctionalInterfaces.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        Predicate<Collection> p = c->c.isEmpty();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        System.out.println(p.test(list));
    }
}
