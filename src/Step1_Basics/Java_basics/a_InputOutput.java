package Step1_Basics.Java_basics;

import java.util.Scanner;

public class a_InputOutput {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a digit: ");
        int num = in.nextInt();

        System.out.println("\n\nEntered digit is..... "+num);

        in.close();
    }
}
