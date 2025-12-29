package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Pawan");
            list.add("Ravi");
            list.add("Chiranjeevi");
            list.add("Nagaarjuna");
            list.add("Durga");
            list.add("Venkatesh");
            System.out.println(list);
            List<String> result = list.stream().map(String::toUpperCase).collect(Collectors.toList());
            System.out.println(result);
        }
    }

