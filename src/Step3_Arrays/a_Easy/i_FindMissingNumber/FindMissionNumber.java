package Step3_Arrays.a_Easy.i_FindMissingNumber;

import java.util.Arrays;

public class FindMissionNumber {
    public static void main(String[] args){
        int[] array = {3,0,1,7,4,2,5};
        System.out.println(Missing_better(array));
    }

    //using linear search for each value
    private static int Missing_brute(int[] nums){
        boolean found;

        for(int i=0; i<=nums.length; i++){
            found = false;

            for(int j=0; j<nums.length; j++){
                if(nums[j]==i){
                   found = true;
                   break;
                }
            }
            if(!found){
                return i;
            }
        }
        return nums.length;
    }

    //using sort
    private static int Missing_sorting(int[] nums){
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }

    //using hashing
    private static int Missing_better(int[] nums){
        boolean[] present = new boolean[nums.length + 1];

        for(int num: nums){
            present[num] = true;
        }

        for(int i=0; i<=nums.length; i++){
            if(!present[i]){
                return i;
            }
        }
        return nums.length;
    }

    //using SUM
    private static int Missing_optimalSum(int[] nums){
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<=nums.length; i++){
            sum1 += i;
        }

        for(int num: nums){
            sum2 += num;
        }

        return sum1 - sum2;
    }


}
