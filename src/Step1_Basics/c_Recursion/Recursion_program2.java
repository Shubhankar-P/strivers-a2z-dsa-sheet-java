package Step1_Basics.c_Recursion;

import java.util.Scanner;

//Print name N times using recursion
public class Recursion_program2 {
    public static void printNTimes(String name, int n){
        if(n==0)
            return;

        System.out.println(name);
        printNTimes(name, n-1);
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("value of N: ");
        int n = in.nextInt();

        printNTimes(name, n);
        in.close();
    }
}
