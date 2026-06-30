package Step1_Basics.b_Maths_basics;

import java.util.Scanner;

public class g_GCD_HCF {

    private static int printGCD_brute(int num1, int num2){
        int limit = Math.min(num1, num2);
        for(int i=limit; i>=1; i--){
            if(num1%i==0 && num2%i==0){
                return i;
            }
        }
      return 1;
    }

    private static int printGCD_euclideanAlgorithm(int num1, int num2){
        while(num1>0 && num2>0){
            if(num1>num2){num1 = num1%num2;}
            else{num2=num2%num1;}
        }
        if(num1==0){return num2;}
        return num1;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int number1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int number2 = in.nextInt();

        System.out.println("Greatest Common Divisor: "+printGCD_euclideanAlgorithm(number1, number2));
        in.close();
    }
}
