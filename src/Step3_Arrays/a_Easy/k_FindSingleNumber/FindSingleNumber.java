package Step3_Arrays.a_Easy.k_FindSingleNumber;

import java.util.HashMap;
import java.util.Map;

public class FindSingleNumber {

    public static void main(String[] args){

        int[] arr = {4,2,1,5,2,1,4};
        System.out.println(findSingleNumber_myHashingApproach(arr));

    }

    // my approach (brute force) [have to watch striver's video for other approaches]
    private static int findSingleNumber_brute(int[] nums){

        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==nums[i]){
                    count++;
                }
                if(count==2){
                    break;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        return 0;
    }

    //tried a hashing approach, but it fails for negative and large numbers (works only if nums are between 0-9)
    // this was hashing using Arrays
    private static int findSingleNumber_myHashingApproach(int[] nums){
        int[] freq = new int[10];

        for(int num: nums){
            freq[num]++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i]==1){
                return i;
            }
        }

        return 0;

        // ❌ Used fixed-size freq array assuming values are in range 0–9
        // ❌ Fails for negative or large numbers (ArrayIndexOutOfBounds)
        // ❌ Returned array index instead of the actual number
        // ❌ Default return value (0) may give wrong answer
    }

    // This is hashing using hashmaps, which is much better approach
    private static int findSingleNumber_betterHashingApproach(int[] nums){
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }


}
