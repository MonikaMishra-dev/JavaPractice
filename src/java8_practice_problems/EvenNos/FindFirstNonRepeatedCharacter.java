package java8_practice_problems.EvenNos;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "JavaJavgan";
        Character result = str.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(ch->ch,LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1)
                .map(Map.Entry :: getKey)
                .findFirst()
                .orElse(null);
        System.out.println(result);
    }
}
