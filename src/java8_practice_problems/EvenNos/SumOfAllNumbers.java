package java8_practice_problems.EvenNos;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sum = list.stream().mapToInt(Integer::valueOf).sum();
        System.out.println(sum);
    }
}
