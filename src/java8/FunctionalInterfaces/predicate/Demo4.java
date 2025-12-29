package java8.FunctionalInterfaces.predicate;

import java.util.function.Predicate;

public class Demo4 {
    public static void main(String[] args) {

        String[] s = {"Katrina","Kareena","Neha","Alia","Kiara","Kapoor","Krishna","Monika"};

        Predicate<String> p = s1->s1.startsWith("K");
        for(String s2 :s){
            if(p.test(s2))
                System.out.println(s2);
        }
    }
}
