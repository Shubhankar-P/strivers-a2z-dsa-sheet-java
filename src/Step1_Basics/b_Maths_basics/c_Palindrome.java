package Step1_Basics.b_Maths_basics;

import java.util.Scanner;

public class c_Palindrome {
    private static String palindrome(int num){
        int n = num;
        int revNum = 0, lastDigit = 0;

        while(n>0){
            lastDigit = n%10;
            revNum = (revNum*10)+lastDigit;
            n/=10;
        }

        return revNum==num? "Yes": "No";
    }

    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int number = in.nextInt();

       System.out.println("Is it a Palindrome number?: "+palindrome(number));
       in.close();
    }
}
