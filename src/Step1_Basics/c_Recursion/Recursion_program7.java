package Step1_Basics.c_Recursion;

import java.util.Arrays;
import java.util.Scanner;

//Reverse an array using recursion
public class Recursion_program7 {
    private static void reverseArray( int[] arr,int l, int r){
        if(l>=r){
            return;
        }
        swap(arr, l, r);
        reverseArray(arr, l+1, r-1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String [] args){
        int[] array = {1,2,4,5,2,8,9,5,6,7};
        System.out.println("Original Array: "+Arrays.toString(array));
        reverseArray(array, 0, array.length-1);
        System.out.println("Reversed Array: "+ Arrays.toString(array));
    }
}
