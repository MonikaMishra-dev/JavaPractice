package arrays.basics;


import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5,3,4,7,7,5,7,8,9,7};
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println("The Frequency of each element is "+map);
    }
}
