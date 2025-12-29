package java8.FunctionalInterfaces.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChainingDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String uname = sc.nextLine();
        System.out.println("enter Password");
        String pwd = sc.nextLine();
        Function<String,String> function1 = str -> str.substring(0,5);
        Function<String,String> function2 = str -> str.toLowerCase();
        if(function1.andThen(function2).apply(uname).equals("durga") && pwd.equals("java"))
            System.out.println("Valid User");
        else
            System.out.println("Invalid User");
    }
}
