package java8.FunctionalInterfaces.function;

import java.util.function.Function;

public class FunctionChainingDemo6 {
    public static void main(String[] args) {
        Function<String,String> f1 = str -> str.toUpperCase();
        Function<String,String> f2 = str -> str.substring(0,9);
        System.out.println(f1.apply("MonikaMishra"));
        System.out.println(f2.apply("MonikaMishra"));
        System.out.println(f1.andThen(f2).apply("MonikaMishra"));
        System.out.println(f1.compose(f2).apply("MonikaMishra"));
    }
}
