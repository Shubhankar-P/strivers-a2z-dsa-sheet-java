package Step3_Arrays.a_Easy.c_CheckSortedArray;


//Check if array is sorted
public class CheckSortedArray {
    public static void main(String[] args){
        int[] arr = {300, 50, 47, 39, 29, 50};
        System.out.println(CheckIfSorted_optimal(arr)?"It's Sorted": "It's not sorted");
    }

    public static boolean CheckIfSorted_optimal(int[] arr){
        if(arr[0]<arr[arr.length-1]) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) { return false; }
            }
        }
        else{
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) { return false; }
            }
        }
        return true;
    }
}
