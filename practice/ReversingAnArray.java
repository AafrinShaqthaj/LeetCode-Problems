package practice;

import java.util.Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {
        int[] arr = {1,8,3,7,5,6,9};
        System.out.println(Arrays.toString(rev(arr)));
    }

    public static int[] rev(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }

    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
