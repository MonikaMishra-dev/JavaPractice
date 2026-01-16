package java8_practice_problems.EvenNos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStringsToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Riya","Ashutosh","Monika","Aman","shreeda");
        List<String> result = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);
    }
}
