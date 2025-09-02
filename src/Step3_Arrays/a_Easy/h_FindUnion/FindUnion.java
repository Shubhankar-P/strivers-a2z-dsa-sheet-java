package Step3_Arrays.a_Easy.h_FindUnion;

import java.util.Arrays;
import java.util.HashSet;

public class FindUnion {
    public static void main(String[] args){
      int[] arr1={1,2,2,3,3};
      int[] arr2={2,2,2,4,4,4,5,5};
      System.out.println(Arrays.toString(findUnion_brute(arr1, arr2)));
    }

    private static int[] findUnion_brute(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for(int i:arr1){
            set.add(i);
        }

        for(int i:arr2){
            set.add(i);
        }

        int[] arr_union = new int[set.size()];
        int i=0;
        for(int value:set){
            arr_union[i++]=value;
        }

        return arr_union;
    }
}
