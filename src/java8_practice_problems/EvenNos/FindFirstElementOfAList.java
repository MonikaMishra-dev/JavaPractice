package java8_practice_problems.EvenNos;


import java.util.Arrays;
import java.util.List;

public class FindFirstElementOfAList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4);
        list.stream().findFirst().ifPresent(System.out::println);
    }
}
