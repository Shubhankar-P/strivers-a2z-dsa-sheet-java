package Step1_Basics.Maths_basics;

import java.util.Scanner;

public class b_ReverseNumber {
    private static int reverseNumber(int num){
        int revNum=0;
        int lastDigit;

        while(num>0){
            lastDigit = num%10;
            revNum = (revNum*10) + lastDigit;
            num/=10;
        }

        return revNum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        System.out.println("Reversed number: "+reverseNumber(number));
        in.close();
    }
}
