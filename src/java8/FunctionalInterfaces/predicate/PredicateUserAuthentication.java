package java8.FunctionalInterfaces.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
    String username;
    String password;
    User(String username,String password){
        this.username = username;
        this.password = password;
    }
}

public class PredicateUserAuthentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = sc.nextLine();
        System.out.println("Enter Password");
        String password = sc.nextLine();
        User user = new User(username,password);
        Predicate<User> predicate = obj -> obj.username.equals("durga") && obj.password.equals("java");
        if(predicate.test(user))
            System.out.println("Access Allowed");
        else
            System.out.println("Access Denied");

    }
}
