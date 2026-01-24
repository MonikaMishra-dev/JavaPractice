package java8_practice_problems.EvenNos;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindLongestStringInAList {
    public static void main(String[] args) {
        List<String> list = List.of("Hello","Monika","Riya","Venkatesh","Encyclopedia");
        String  str = list.stream().max(Comparator.comparing(String::length)).get();
        System.out.println("The Longest string is "+str);
    }
}
