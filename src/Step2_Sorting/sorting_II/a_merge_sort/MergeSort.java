package Step2_Sorting.sorting_II.a_merge_sort;

import java.util.Arrays;

public class MergeSort {
    private static void mergeSort(int[] arr, int low, int high){
        if(low>=high) return;
        int middle = (low + high)/2;

        mergeSort(arr, low, middle);
        mergeSort(arr, middle+1, high);
        merge(arr, low, middle, high);

    }

    private static void merge(int[] arr, int low, int middle, int high){
        int[] temp = new int[high-low+1];
        int tempIndex=0;
        int left = low;
        int right = middle+1;

        while(left<=middle && right<=high){
            if(arr[left]<=arr[right]){
                temp[tempIndex] = arr[left];
                left++;
                tempIndex++;
            }
            else{
                temp[tempIndex] = arr[right];
                right++;
                tempIndex++;
            }
        }

        while(left<=middle){
            temp[tempIndex] = arr[left];
            left++;
            tempIndex++;
        }
        while(right<=high){
            temp[tempIndex] = arr[right];
            right++;
            tempIndex++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp[i-low];
        }

    }

    public static void main(String[] args){
        int[] nums = {23,34,29,73,1,54,12,46};

        System.out.println("Original: "+ Arrays.toString(nums));
        mergeSort(nums,0, nums.length - 1);
        System.out.println("Sorted: "+ Arrays.toString(nums));
    }
}
