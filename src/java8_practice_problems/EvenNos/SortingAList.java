package java8_practice_problems.EvenNos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,1,5,8,3,7);
        List<Integer> asc =  list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Sorted in Ascending order "+asc);
        List<Integer> desc = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted in Descending order "+desc);

    }
}
