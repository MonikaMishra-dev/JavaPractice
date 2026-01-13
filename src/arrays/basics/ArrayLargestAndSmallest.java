package arrays.basics;


import java.util.Arrays;

public class ArrayLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {20, 37, 45, 10, 21, 90};
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
                min = arr[i];
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Smallest Element is "+min);
        System.out.println("Largest Element is "+max);


        //using java8
        int minimum = Arrays.stream(arr).min().getAsInt();
        int maximum = Arrays.stream(arr).max().getAsInt();
        System.out.println("Smallest Element is "+minimum);
        System.out.println("Largest Element is "+maximum);

    }
}
