package arrays.basics;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {40,35,23,46,7,90};
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length - i-1];
            arr[arr.length -i-1] = temp;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
