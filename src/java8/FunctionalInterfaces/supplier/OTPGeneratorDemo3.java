package java8.FunctionalInterfaces.supplier;

import java.util.function.Supplier;

public class OTPGeneratorDemo3 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            StringBuilder otp = new StringBuilder();
            for(int i=0;i<6;i++){
                otp.append((int)(Math.random() * 10));
            }
            return otp.toString();
        };
        System.out.println(supplier.get());
    }
}
