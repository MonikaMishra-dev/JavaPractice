package java8.streams;

import java.util.ArrayList;

public class ToArrayMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Monika");
        list.add("Vaani");
        list.add("Shreeda");
        list.add("Aman");
        list.add("Ashutosh");
        System.out.println(list);
        String[] names = list.stream().toArray(String[]::new);
        for(String s : names){
            System.out.println(s);
        }
    }
}
