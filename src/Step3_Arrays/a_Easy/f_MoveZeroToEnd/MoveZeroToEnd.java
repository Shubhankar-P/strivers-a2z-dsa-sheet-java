package Step3_Arrays.a_Easy.f_MoveZeroToEnd;

import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args){
        int[] arr={0,3,0,1,0,0,3,6,0};
        System.out.println(Arrays.toString(moveZeroToEnd(arr)));
    }

    private static int[] moveZeroToEnd(int[] nums){
                int i=0;
                for(int j=0; j<nums.length; j++){
                    if(nums[j] != 0){
                        int temp = nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        i++;
                    }
                }
                return nums;
    }
}
