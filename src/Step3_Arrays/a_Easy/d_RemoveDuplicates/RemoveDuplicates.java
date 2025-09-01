package Step3_Arrays.a_Easy.d_RemoveDuplicates;


//remove any duplicates found in the array

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {2,5,9,6,3,2,4,5};
        int[] result = RemoveDuplicates_brute(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] RemoveDuplicates_brute(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int num:arr){
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i=0;
        for(int num:set){
            result[i++]=num;
        }

        return result;
    }
}
