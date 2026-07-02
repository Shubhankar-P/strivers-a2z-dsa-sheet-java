package Step2_Sorting.sorting_I.b_bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        //does adjacent swaps till the largest reaches end, repeats for entire array....
        for(int j=0; j<arr.length-1;j++) {
            boolean swapped = false;
            for (int i = 0; i < arr.length - j-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {23,34,29,73,1,54,12,46};

        System.out.println("Original: "+ Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("Sorted: "+ Arrays.toString(nums));
    }
}
