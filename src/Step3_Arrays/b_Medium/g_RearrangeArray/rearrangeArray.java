package Step3_Arrays.b_Medium.g_RearrangeArray;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Rearrange array in an alternating +ve and -ve way
public class rearrangeArray {

    public static void main(String[] args){
        int[] originalArr = {3,-25,-2,-1,-9,4,6,21,32,-52};   //half positive numbers, half negative numbers
        int[] alternateArr = alternatePosNeg_brute(originalArr);
        System.out.println(Arrays.toString(alternateArr));
    }

    private static int[] alternatePosNeg_brute(int[] original){
        int size = (original.length);
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for(int num: original){
            if(num>=0){ positive.add(num);}
            else{ negative.add(num);}
        }

        int[] alternate = new int[size];
        for(int i=0; i<positive.size(); i++){
            alternate[i*2] = positive.get(i);
        }
        for(int i=0; i<negative.size(); i++){
            alternate[(i*2)+1] = negative.get(i);
        }


        return alternate;
    }
}
