package java8_practice_problems.EvenNos;

import java.util.Arrays;
import java.util.List;

public class TotalNumberOfElementsAndAverage {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        long count = list.stream().count();
        double avg = list.stream().mapToInt(Integer::valueOf).average().orElse(0.0);
        System.out.println("Total is "+count);
        System.out.println("Average is "+avg);
    }
}
