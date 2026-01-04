package java8_practice_problems.EvenNos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNoFromAList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(89);
        list.add(17);
        list.add(88);
        list.add(34);
        list.add(19);
        list.add(50);

        List<Integer> result = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }
}
