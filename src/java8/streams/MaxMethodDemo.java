package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMethodDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(25);
        list.add(15);
        list.add(10);
        list.add(20);
        System.out.println(list);
        Integer max = list.stream().max(Integer::compareTo).get();
        System.out.println(max);
    }
}
