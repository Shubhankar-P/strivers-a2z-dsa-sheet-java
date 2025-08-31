package Step3_Arrays.a_Easy.SecondLargest_Element;

import java.util.Arrays;

public class SecondLargest_Element {
    public static void main(String[] args){
        int[] arr = {2, 4, 37, 29, 80,90,92, 93};
        System.out.println("Second Largest Element: " + SecondLargest_optimal(arr));
    }

    public static int SecondLargest_brute(int[] arr){
        Arrays.sort(arr);
        for(int i=arr.length-2; i>=0; i--) {
            if (arr[i] < arr[arr.length - 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int SecondLargest_optimal(int[] arr){
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num>largest){
                sLargest = largest;
                largest = num;
            }
            else if(num>sLargest && num<largest){
                sLargest = num;
            }
        }
        return (sLargest == Integer.MIN_VALUE? -1 : sLargest);
    }

}
