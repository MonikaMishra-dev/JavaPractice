package java8.FunctionalInterfaces.function;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
        String str = "Durga Software Solutions Hydrebad";
        Function<String,String> function = s -> s.replaceAll(" ","");
        System.out.println(function.apply(str));
    }
}
