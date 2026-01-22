package arrays.basics;

import java.util.*;
public class FindAllPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 1, 2, 3};
        Set<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    set.add("("+arr[i]+","+arr[j]+")");
                }
            }
        }
        if(set.isEmpty())
            System.out.println("No Pair Found");
        else{
         for(String str : set){
             System.out.println(str);
         }
        }
    }
}

