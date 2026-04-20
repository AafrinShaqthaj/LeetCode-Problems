package practice;

import java.util.Arrays;

public class SwapInArrays {
    public static void main(String[] args) {
        int[] arr = {1,8,3,7,5,6,9};
        System.out.println(Arrays.toString(swap(arr, 0, 3)));
    }
    public static int[] swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }
}
