package Step1_Basics.c_Recursion;

//Understand recursion by printing something N times

import java.util.Scanner;

public class Recursion_program1 {
    public static void printHappyBirthday(int num){
        if(num>0) {
            System.out.println(" Happy Birthday "+num + "!");
            printHappyBirthday(num-1);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Print this statement N times: ");
        System.out.println("-------Happy Birthday 'N' !-------");
        System.out.print("value of N: ");
        int n = in.nextInt();
        in.close();
        printHappyBirthday(n);
    }
}
