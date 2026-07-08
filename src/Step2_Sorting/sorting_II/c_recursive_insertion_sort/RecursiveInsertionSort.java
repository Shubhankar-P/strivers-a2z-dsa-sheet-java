package Step2_Sorting.sorting_II.c_recursive_insertion_sort;

import java.util.Arrays;

public class RecursiveInsertionSort {
    private static void recursiveInsertionSort(int[] arr, int i){
        if(i==arr.length) return;
        compare(arr, i-1, arr[i]);
        recursiveInsertionSort(arr, i+1);
    }

    private static void compare(int[] arr, int j, int current){
       if(j==-1 || arr[j]<=current){
           arr[j+1] = current;
           return;
       }
           arr[j+1] = arr[j];
           compare(arr, j-1, current);
    }

    public static void main(String[] args){
        int[] nums = {23,34,29,73,1,54,12,46};

        System.out.println("Original: "+ Arrays.toString(nums));
        recursiveInsertionSort(nums, 1);
        System.out.println("Sorted: "+ Arrays.toString(nums));
    }
}
