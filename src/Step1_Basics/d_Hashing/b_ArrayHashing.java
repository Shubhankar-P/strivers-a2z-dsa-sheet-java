package Step1_Basics.d_Hashing;

import java.util.Arrays;

public class b_ArrayHashing {
    public static int[] arrayHashing_case1(int[] arr){
        // assuming that max value is SMALL and KNOWN
        int[]hash = new int[13];
        for(int n: arr){
            hash[n]++;
        }
        return hash;
    }

    public static int[] arrayHashing_case2(char[] arr){
        // assuming characters are between 'a' and 'z'
        int[] hash = new int[26];
        for(char ch: arr){
            hash[ch - 'a']++;
        }
        return hash;
    }

    public static int[] arrayHashing_case3(char[] arr){
        // character can be anything: a,A,1,# (small, capital, numeric, symbol)
        int[] hash = new int[256];
        for(char ch: arr){
            hash[ch]++;
        }
        return hash;
    }

    public static void main(String[] args){
        System.out.println("---------------Case 1: Maximum value in array is small------------------");
        int[] arr1 = {1,2,4,2,3,6,1,4,3,1,0};
        int[] queries1 = {1,2,4};
        System.out.println("Array: "+Arrays.toString(arr1));
        System.out.println("Queries: "+Arrays.toString(queries1));

        System.out.println("Answer: ");
        int[] hash = arrayHashing_case1(arr1);
        for(int q: queries1){
            System.out.println("\t\t"+ q + " -> " + hash[q]);
        }

        System.out.println("\n\n---------------Case 2: Character Hashing (lowercase only)--------------------");
        char[] chars = {'a','b','e','j','s','c','a','a','a','b','a','e'};
        char[] queries2 = {'a', 'b', 'e'};
        System.out.println("Array: "+Arrays.toString(chars));
        System.out.println("Queries: "+Arrays.toString(queries2));

        System.out.println("Answer: " );
        int[] hash2 = arrayHashing_case2(chars);

        for(char q: queries2){
            System.out.println("\t\t" + q + " -> " + hash2[q - 'a']);
        }


        System.out.println("\n\n---------------Case 3: Character Hashing (any character, using ASCII)---------------");
        char[] arr3 = {'a','#','1','s','S','c','1','a','a','#','1','S'};
        char[] queries3 = {'a', '#', 'S', '1'};
        System.out.println("Array: "+Arrays.toString(arr3));
        System.out.println("Queries: "+Arrays.toString(queries3));

        System.out.println("Answer: " );
        int[] hash3 = arrayHashing_case3(arr3);

        for(char q: queries3){
            System.out.println("\t\t" + q + " -> " + hash3[q]);
        }
    }
}
