package Step3_Arrays.a_Easy.d_RemoveDuplicates;


//remove any duplicates found in the array

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {2,2,3,5, 5, 6,6,7};
      //  int[] result = RemoveDuplicates_brute(arr);
     //   System.out.println(Arrays.toString(result));
        System.out.println("Number of Unique elements: " + removeDuplicates_optimal(arr));
    }

    private static int[] RemoveDuplicates_brute(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int num:arr){       //traverse through array, put unique elements in Set
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i=0;                    // put in a new array
        for(int num:set){
            result[i++]=num;
        }

        return result;
    }

    //Leetcode question's solution
    // array is already sorted, remove duplicates in-place and return number of unique elements
   private static int removeDuplicates_optimal(int[] nums){
               int i=0;
               for(int j=1; j<nums.length; j++){
                   if(nums[i] != nums[j]){
                       nums[i+1]=nums[j];
                       i++;
                   }
               }
               int k = i+1;
               return k;
   }
}
