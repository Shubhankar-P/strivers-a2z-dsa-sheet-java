package Step1_Basics.d_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class c_HashMap {
    public static Map<Integer, Integer> hashing_usingHashMap(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        return map;
    }

    public static void highestLowestFrequency(Map<Integer, Integer> map){
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        int maxElement = -1;
        int minElement = -1;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int element = entry.getKey();
            int freq = entry.getValue();

            if(freq > maxFreq){
                maxFreq = freq;
                maxElement = element;
            }

            if(freq<minFreq){
                minFreq = freq;
                minElement = element;
            }
        }

        System.out.println("Highest Frequency Element: "+maxElement);
        System.out.println("Lowest Frequency Element: "+minElement);
    }

    public static void main(String[] args){
        System.out.println("----------------Hashing using HashMap-----------------");
        int[] arr = { 1000000000, 999999999, 1000000000, 5, 5, 5};
        int[] queries = {1000000000, 5, 7};

        System.out.println(" Array: " + Arrays.toString(arr));
        System.out.println("Queries: " + Arrays.toString(queries));
        System.out.println("Answer: ");

        Map<Integer, Integer> map = hashing_usingHashMap(arr);

        for(int q: queries){
            System.out.println("\t\t"+q + " -> " + map.getOrDefault(q,0));
        }

        highestLowestFrequency(map);
    }
}
