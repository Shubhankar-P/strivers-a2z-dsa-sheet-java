package Step3_Arrays.a_Easy.e_LeftRotateArray;

import java.util.Arrays;

public class RightRotateArray_byDplace {
    public static void main(String[] args){
        int[] arr = {200,4,5,6,7, 90};
        int k=2;
        System.out.println(Arrays.toString(rightRotate_Dplace(arr, k)));
    }

    static int[] rightRotate_Dplace(int[] nums, int k){
        int n = nums.length;
        int d = k % n;

        // store last d elements in temp
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = nums[n - d + i];
        }

        // shift remaining elements to the right
        for (int i = n - d - 1; i >= 0; i--) {
            nums[i + d] = nums[i];
        }

        // copy temp back to front
        for (int i = 0; i < d; i++) {
            nums[i] = temp[i];
        }
        return nums;
    }
}
