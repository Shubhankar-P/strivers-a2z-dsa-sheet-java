package Step3_Arrays.a_Easy.e_LeftRotateArray;

import java.util.Arrays;

//Left rotate an array by 1 place
public class LeftRotateArray_by1place {
    public static void main(String[] args){
        int[] arr = {200,4,5,6,7, 90};
        System.out.println(Arrays.toString(leftRotate_1place(arr)));
    }

    static int[] leftRotate_1place(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++ ){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]=temp;

        return arr;
    }
}
