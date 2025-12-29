package java8.FunctionalInterfaces.supplier;

import java.util.function.Supplier;

public class PasswordGeneratorDemo4 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            StringBuilder pwd = new StringBuilder();
            String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
            Supplier<Integer> d = () -> (int) (Math.random() * 10);
            Supplier<Character> c = () -> symbol.charAt((int) (Math.random() * 29));
            for (int i = 1; i <= 8; i++) {
                if (i % 2 == 0) {
                    pwd.append(d.get());
                } else {
                    pwd.append(c.get());
                }
            }

            return pwd.toString();
        };
        System.out.println(supplier.get());
    }
}
