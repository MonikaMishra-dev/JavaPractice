package java8.FunctionalInterfaces.function;

import java.util.function.BiFunction;

public class BiFunctionDemo9 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> f = (a,b)-> a*b;
        System.out.println(f.apply(10,20));
    }
}
