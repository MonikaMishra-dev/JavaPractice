package java8.lambdas_with_collections;

import java.util.*;

public class SortTreeSet {
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>((i1,i2)->i1>i2?-1:i1<i2?1:0);
        set.add(10);
        set.add(0);
        set.add(15);
        set.add(20);
        set.add(5);
        System.out.println(set);
    }
}
