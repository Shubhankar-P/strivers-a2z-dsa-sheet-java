package Step1_Basics.b_Maths_basics;

import java.util.Scanner;

public class f_PrimeNumber {
    private static String checkPrimeNumber(int num){
        if(num<= 1){return "No";}

        for(int i=2; i*i<=num; i++){
            if(num%i==0){
               return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        System.out.println("Is it a Prime Number?: "+checkPrimeNumber(number));
        in.close();
    }
}
