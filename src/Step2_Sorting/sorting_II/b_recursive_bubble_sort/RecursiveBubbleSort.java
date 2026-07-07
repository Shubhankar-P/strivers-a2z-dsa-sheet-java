package Step2_Sorting.sorting_II.b_recursive_bubble_sort;

import java.util.Arrays;

public class RecursiveBubbleSort {
    private static void recursiveBubbleSort(int[] arr, int tail){
        if(0 == tail) return;

        compare(arr, 0, tail);
        recursiveBubbleSort(arr,tail-1);
    }

    private static void compare(int[] arr, int i, int tail){
        if(i==tail) return;

        if(arr[i]>arr[i+1]){
            swap(arr, i, i+1);
        }

        compare(arr, i+1, tail);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] nums = {23,34,29,73,1,54,12,46};

        System.out.println("Original: "+ Arrays.toString(nums));
        recursiveBubbleSort(nums, nums.length-1);
        System.out.println("Sorted: "+ Arrays.toString(nums));
    }
}
