package arrays;

public class ArraySecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {20, 37, 45, 10, 21, 90};
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max1){
                max2 = max1;
                max1=arr[i];
            }
            else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("Second Smallest Element: "+min2);
        System.out.println("Second Largest Element: "+max2);
    }
}
