package arrays.basics;



public class MissingNumbersInAnArray {
    public static void main(String[] args) {
        int[] arr = {8,7,6,10,11,12,13,16,17,18,20};
        int min = arr[0];
        int max = arr[0];
        for(int num : arr){
            min = Math.min(num,min);
            max = Math.max(num,max);
        }
        boolean[] isPresent = new boolean[max-min+1];
        for(int num : arr){
            isPresent[num-min] = true;
        }
        for(int i=0;i<isPresent.length;i++){
            if(!isPresent[i]){
                System.out.println("Missing number "+(min+i));
            }
        }
    }
}
