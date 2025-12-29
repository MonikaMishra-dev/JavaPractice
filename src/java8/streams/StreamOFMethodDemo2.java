package java8.streams;

import java.util.stream.Stream;

public class StreamOFMethodDemo2 {
    public static void main(String[] args) {
        Double[] d = {10.0,10.1,10.2,10.3,10.4,10.5};
        Stream<Double> s = Stream.of(d);
        s.forEach(System.out::println);
    }
}
