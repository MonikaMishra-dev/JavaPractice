package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pawan");
        list.add("Ravi");
        list.add("Chiranjeevi");
        list.add("Nagaarjuna");
        list.add("Durga");
        list.add("Venkatesh");
        System.out.println(list);
        long count = list.stream().filter(s->s.length()>=9).count();
        System.out.println(count);
    }
}
