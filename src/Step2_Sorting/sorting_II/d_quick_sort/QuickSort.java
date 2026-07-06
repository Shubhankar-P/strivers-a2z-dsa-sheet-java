package Step2_Sorting.sorting_II.d_quick_sort;

import java.util.Arrays;

public class QuickSort {
    private static void quickSort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int pivotIndex = partition(arr, low, high);

        quickSort(arr, low, pivotIndex-1);
        quickSort(arr, pivotIndex+1, high);
    }

    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j= low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        int pivotIndex = i+1;
        swap(arr, pivotIndex, high);

        return pivotIndex;
    }

    private static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args){
        int[] nums = {23,34,29,73,1,54,12,46};

        System.out.println("Original: "+ Arrays.toString(nums));
        quickSort(nums,0, 7);
        System.out.println("Sorted: "+ Arrays.toString(nums));
    }
}
