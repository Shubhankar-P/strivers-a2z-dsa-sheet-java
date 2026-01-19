package Step3_Arrays.b_Medium.b_Sort0_1_2;

import java.util.Arrays;
import java.util.HashMap;

public class Sort012 {
    public static void main(String[] args){
        int[] arr = {2,0,1,1,2,0,2,0,1};
        System.out.println(Arrays.toString(sortColors_brute(arr)));
    }

    public static int[] sortColors_brute(int[] nums) {      //actual brute is using sort(), but on leetcode they have mentioned not to use sort().

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[j]==0){    //red found, so swap with i pointer
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
            for(int j=0; j<nums.length; j++){
                if(nums[j]==1){    //white found, so swap with i pointer
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }
            for(int j=0; j<nums.length; j++){
                if(nums[j]==2){    //blue found, so swap with i pointer
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                }
            }

        }

        return nums;
    } // O(N*N)

    private static int[] sortColors_better(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){

            }
        }

        return nums;
    }

}
