package java8_practice_problems.EvenNos;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfEachCharacterInAString {
    public static void main(String[] args) {
        String str = "java";
        Map<Character, Long> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
