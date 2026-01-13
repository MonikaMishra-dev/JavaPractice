package arrays.basics;

public class CopyOneArrayIntoAnother {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,7,3};
        int[] arr1 = new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            arr1[i] = arr[i];
//        }


        System.arraycopy(arr,0,arr1,0,arr.length);


//       arr1 =  Arrays.copyOf(arr,arr.length);
        for(int num : arr1){
            System.out.print(num+" ");
        }
    }
}
