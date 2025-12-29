package java8.lambdas_with_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(0);
        list.add(15);
        list.add(20);
        list.add(5);
        //Sorted by Default Natural Sorting Order i.e, Ascending
       // Collections.sort(list);

        //Customized Sorting Order
//        Collections.sort(list,new MyComparator());

        list.sort((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
        System.out.println(list);
    }
}
class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int i1 = (Integer)o1;
        int i2 = (Integer)o2;

        if(i1>i2)
            return -1;
        else if(i1<i2)
            return 1;
        else
        return 0;
    }
}
