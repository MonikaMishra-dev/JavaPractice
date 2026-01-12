package arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayCheckForSorting {
    public static void main(String[] args) {
        int[] arr = {1,2,90,4,5,6};
        boolean isAscending = true;
        boolean isDescending = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                isAscending = false;
            if(arr[i]<arr[i+1])
                isDescending = false;
        }
if(isAscending)
    System.out.println("The array is sorted in ascending order");
else if(isDescending)
    System.out.println("The array is sorted in descending order");
else
    System.out.println("The Array is not sorted");



    }
}



