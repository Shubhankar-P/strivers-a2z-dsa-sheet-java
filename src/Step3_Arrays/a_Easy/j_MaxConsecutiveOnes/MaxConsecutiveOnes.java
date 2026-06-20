package Step3_Arrays.a_Easy.j_MaxConsecutiveOnes;

public class MaxConsecutiveOnes {
    public static void main(String[] args){
       int[] binaryArray = {1,1,0,1,1,1,1,0,1,1,1};
       System.out.println(maxConsecutiveOnes_myApproach(binaryArray));
    }

    //my approach using for loop (need to watch striver's video for understanding other approaches)
    private static int maxConsecutiveOnes_myApproach(int[] nums){
        int maxCount=0;
        int count=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count += 1;
            }
            if(nums[i]==0 || i==nums.length-1){
                if(count>maxCount){
                    maxCount = count;
                }
                count = 0;
            }
        }
        return maxCount;
    }

}
