package java8_practice_problems.EvenNos;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class MaxAndMinInAList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,2,67);
//        int min = list.stream().mapToInt(Integer::valueOf).min().orElse(Integer.MIN_VALUE);
        int max = list.stream().mapToInt(Integer::valueOf).max().orElse(Integer.MIN_VALUE);
        int min = list.stream().min(Comparator.naturalOrder()).orElse(Integer.MAX_VALUE);
        System.out.println("Minimum is "+min);
        System.out.println("Maximum is "+max);
    }
}
