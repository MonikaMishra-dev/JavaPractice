package java8.FunctionalInterfaces.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo5 {
    public static void main(String[] args) {
        String[] str = {"Hello","World","",null,"Riya",null,""};
        Predicate<String> predicate = s -> s!=null && !s.isEmpty();
        ArrayList<String> list = new ArrayList<>();
        for(String s1 : str){
            if(predicate.test(s1))
                list.add(s1);
        }
        System.out.println("The list of new string is "+list);
    }
}
