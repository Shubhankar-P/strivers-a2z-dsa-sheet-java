package Step2_Sorting.sorting_I.a_selection_sort;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        //iterates the entire array, finds minimum & swaps
        for(int i=0; i<arr.length-1; i++) {
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex!=i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {23,34,29,73,1,54,12,46};

        System.out.println("Original: "+ Arrays.toString(nums));
        selectionSort(nums);
        System.out.println("Sorted: "+ Arrays.toString(nums));
    }
}
