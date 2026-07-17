package Step3_Arrays.a_Easy.e_LeftRotateArray;

import java.util.Arrays;

public class RightRotateArray_byKplace {
    public static void main(String[] args){
        int[] arr = {200,4,5,6,7, 90};
        int k=2;
        System.out.println(Arrays.toString(rightRotate_Kplace(arr, k)));
    }

    // this solution is good if extra space is ok [save time, extra space]
    static int[] rightRotate_Kplace(int[] nums, int k){
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

    // in-memory reversal algorithm [saves time + space]
    public void rightRotate_Kplace_optimal(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if(k==0){return;}

        // 1. reverse the entire array
        reverse(nums, 0, n-1);

        //2. reverse first k elements
        reverse(nums, 0, k-1);

        //3. reverse remaining n-k elements
        reverse(nums, k, n-1);
    }

    private static void reverse(int[] arr, int head, int tail){
        while(head<tail){
            swap(arr, head, tail);
            head++;
            tail--;
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
