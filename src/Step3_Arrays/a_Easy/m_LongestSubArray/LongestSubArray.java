package Step3_Arrays.a_Easy.m_LongestSubArray;

import java.util.HashMap;

public class LongestSubArray {
    public static void main(String[] args){
        int[] arr = {9, -3, 3, -1, 6, -5};
        int k = 6;

        System.out.println("Longest Sub-Array with sum "+k+": "+ LongestSubArray_optimal(arr, k));
    }

    //prefix + hashing (HashMap)
    private static int LongestSubArray_optimal(int[] arr, int sumExpected){

        //<prefixSum, FirstIndex>
        HashMap<Integer, Integer> prefixMap = new HashMap<>();

        int maxLength = 0;
        int prefixSum = 0;


        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            if (prefixSum == sumExpected) {
                maxLength = i + 1;
            }

            int remaining = prefixSum - sumExpected;

            if (prefixMap.containsKey(remaining)) {
                int length = i - prefixMap.get(remaining);
                maxLength = Math.max(maxLength, length);
            }

            if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
        }


        return maxLength;
    }
}
