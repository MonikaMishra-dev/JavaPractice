package java8.FunctionalInterfaces.function;

import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        String str = "Durga Software Solutions Hydrebad";
        Function<String,Integer> function = s -> s.length() - s.replaceAll(" ","").length();
        System.out.println(function.apply(str));
    }
}
