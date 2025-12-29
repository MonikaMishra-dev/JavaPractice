package java8.FunctionalInterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerChainingDemo4 {
    public static void main(String[] args) {
        Consumer<String> c1= str -> System.out.println("Length : "+str.length());
        Consumer<String> c2= str -> System.out.println("Uppercase : "+str.toUpperCase());
        Consumer<String> c3= str -> System.out.println("SubString : "+str.substring(0,6));
        Consumer<String> chainedConsumer = c1.andThen(c2).andThen(c3);
        chainedConsumer.accept("Hello World");
    }
}
