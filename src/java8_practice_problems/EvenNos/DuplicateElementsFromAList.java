package java8_practice_problems.EvenNos;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementsFromAList
{
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(23,2,4,5,4,3,6,7,8,8,2,4);
        list.stream().filter(num -> Collections.frequency(list, num) > 1).collect(Collectors.toSet()).forEach(System.out::println);


        //Approach 1 Using Map

//        List<Integer> result = new ArrayList<>();
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int num : list){
//                map.put(num,map.getOrDefault(num,0)+1);
//        }
//        System.out.println(map);
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if(entry.getValue()>1)
//                result.add(entry.getKey());
//        }
//        System.out.println(result);


     //  Approach :2 Using Set

//        Set<Integer> seen = new HashSet<>();
//        Set<Integer> duplicates = new HashSet<>();
//
//        for (int num : list) {
//            if (!seen.add(num)) {
//                duplicates.add(num);
//            }
//        }

    }
}
