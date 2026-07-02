package Step1_Basics.c_Recursion;

import java.util.Scanner;

// Sum of first N numbers
public class Recursion_program5 {
    static int sumOfFirstN(int n){
        if(n==0)
            return 0;

       return n + sumOfFirstN(n-1);
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter value of N: ");
        int n = in.nextInt();
        in.close();
        System.out.println("Sum: "+sumOfFirstN(n));
    }
}
