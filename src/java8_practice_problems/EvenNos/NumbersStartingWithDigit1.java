package java8_practice_problems.EvenNos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithDigit1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,56,349,1167,1116,18,24);
        List<String> result = list.stream().map(String::valueOf).filter(s->s.startsWith("1")).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
