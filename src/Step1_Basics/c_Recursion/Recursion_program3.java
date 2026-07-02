package Step1_Basics.c_Recursion;

import java.util.Scanner;

//print 1 to N using recursion
public class Recursion_program3 {
    static void print1ToN(int n){
        if(n==0)
            return;

        print1ToN(n-1);
        System.out.println(n);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter value of N: ");
        int n = in.nextInt();
        in.close();
        print1ToN(n);
    }
}
