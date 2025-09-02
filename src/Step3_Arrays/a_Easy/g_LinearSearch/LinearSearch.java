package Step3_Arrays.a_Easy.g_LinearSearch;

public class LinearSearch {
    public static void main(String[] args){
        int find = 5;
        int[] arr = {2,3,4,6,5,7,8,9};
        int result = linearSearch(arr, find);
        System.out.println(result==-1? "not found" : "found at index: "+result);
    }

    private static int linearSearch(int[] nums, int find){
        for(int i=0; i<nums.length; i++){
            if(nums[i]==find){
                return i;
            }
        }
        return -1;
    }
}
