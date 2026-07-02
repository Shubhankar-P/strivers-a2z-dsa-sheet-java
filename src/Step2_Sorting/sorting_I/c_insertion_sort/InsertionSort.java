package Step2_Sorting.sorting_I.c_insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                 arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= current;
        }
    }

    public static void main(String[] args){
        int[] nums = {23,34,29,73,1,54,12,46};

        System.out.println("Original: "+ Arrays.toString(nums));
        insertionSort(nums);
        System.out.println("Sorted: "+ Arrays.toString(nums));
    }
}
