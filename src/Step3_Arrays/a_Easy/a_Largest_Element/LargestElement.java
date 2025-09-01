package Step3_Arrays.a_Easy.a_Largest_Element;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args){
        int[] arr = {10, 4, 3, 50, 23, 90, 29, 119};
        System.out.println("Largest element: " + LargestElement_optimal(arr));
    }

    public static int LargestElement_bruteforce(int[] arr){
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Print the last element (largest)
        return arr[arr.length - 1];
    }

    public static int LargestElement_optimal(int[] arr){

        //Step 1: assume 1st element is largest
        int largest=arr[0];

        //Step 2: compare with neighbouring elements and assign largest accordingly
        for(int i=1; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}



