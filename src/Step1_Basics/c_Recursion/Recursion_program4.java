package Step1_Basics.c_Recursion;

import java.util.Scanner;

//print N to 1 using recursion
public class Recursion_program4 {
    static void printNto1(int n){
         if(n==0)
             return;

         System.out.println(n);
         printNto1(n-1);
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter value of N: ");
        int n = in.nextInt();
        in.close();
        printNto1(n);
    }
}
