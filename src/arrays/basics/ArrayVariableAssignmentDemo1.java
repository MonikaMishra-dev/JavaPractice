package arrays.basics;

public class ArrayVariableAssignmentDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr1 = {1,2};
        System.out.println(arr.length);
        System.out.println(arr1.length);
        arr1 = arr;
        System.out.println(arr.length);

    }
}
