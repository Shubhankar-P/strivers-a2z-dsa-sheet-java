package Step3_Arrays.a_Easy.l_LongestSubArray_positivesOnly;

public class LongestSubArray_positives {
    public static void main(String[] args){
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;

        System.out.println("Longest Sub-Array with sum "+k+": "+ LongestSubArray_optimal(arr, k));
    }

    private static int LongestSubArray_brute(int[] arr, int sumExpected){
        int maxLength = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                int length = 0;

                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }

                if(sum==sumExpected){
                    maxLength = Math.max(j-i+1, maxLength);
                }
            }
        }

        return maxLength;
    }


    // Using the Sliding window approach (but this works on positive/non-negative numbers)
    private static int LongestSubArray_optimal(int[] arr, int sumExpected){
        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for(int right=0; right<arr.length; right++){

            //expand the window
            sum += arr[right];

            //shrink the window if needed
            while(sum > sumExpected){
                sum -= arr[left];
                left++;
            }

            //check if we found a valid window
            if(sum == sumExpected){
                maxLength = Math.max(right-left+1, maxLength);
            }
        }

        return maxLength;
    }
}
