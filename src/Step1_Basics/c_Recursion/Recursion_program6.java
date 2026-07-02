package Step1_Basics.c_Recursion;

import java.util.Scanner;

//Factorial of a given number
public class Recursion_program6 {
    static int factorial(int n){
        if(n==0){
            return 1;
        }

        return n*factorial(n-1);
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter value of N: ");
        int n = in.nextInt();
        in.close();
        System.out.println("Factorial: "+factorial(n));
    }
}
