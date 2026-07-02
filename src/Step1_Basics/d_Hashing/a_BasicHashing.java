package Step1_Basics.d_Hashing;

import java.util.Scanner;

public class a_BasicHashing {
    public static int basicHashing_bruteForce(int[] arr, int target){
        int count = 0;
        for(int n: arr){
            if(n==target){ count++;}
        }

        return count;
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
         System.out.print("No. of elements: ");
         int n = in.nextInt();

         int[] nums = new int[n];
         System.out.print("Enter array elements: ");
         for(int i=0; i<n; i++){
             nums[i] = in.nextInt();
         }

         System.out.print("Enter no. of queries: ");
         int queryCount = in.nextInt();

        int[] queries = new int[queryCount];
        System.out.print("Enter query elements: ");
        for(int i=0; i<queryCount; i++){
            queries[i] = in.nextInt();
        }

        for(int q: queries){
            System.out.println(q+" -> " +basicHashing_bruteForce(nums,q));
        }

        in.close();
    }
}
