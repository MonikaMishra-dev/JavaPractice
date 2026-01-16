package java8;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumberInAnArray {
    public static void main(String[] args) {
        int[] arr = {8,7,6,10,11,12,13,16,17,18,20};
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        IntStream.rangeClosed(min,max).filter(num->!set.contains(num)).forEach(System.out::println);
    }
}
