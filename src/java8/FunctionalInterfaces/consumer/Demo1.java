package java8.FunctionalInterfaces.consumer;

import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Hello World");
    }
}
