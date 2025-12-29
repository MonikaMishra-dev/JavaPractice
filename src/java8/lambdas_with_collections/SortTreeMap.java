package java8.lambdas_with_collections;

import java.util.*;

public class SortTreeMap {
    public static void main(String[] args){
        TreeMap<Integer,String> map = new TreeMap<>((i1,i2)->i1>i2?-1:i1<i2?1:0);
        map.put(10,"Monika");
        map.put(5,"Durga");
        map.put(15,"Vaani");
        map.put(0,"Shreeda");
        map.put(20,"Aman");
        System.out.println(map);
    }
}
