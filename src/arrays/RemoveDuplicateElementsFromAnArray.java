package arrays;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,2,3,7,8};
        Set<Integer> set = new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(int num :set){
            result[index++] = num;
        }
       for(int num : result){
           System.out.print(num+" ");
       }
    }
}
