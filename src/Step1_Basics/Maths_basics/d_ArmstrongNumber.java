package Step1_Basics.Maths_basics;

import java.util.Scanner;

public class d_ArmstrongNumber {
    private static int countDigits(long num){
        if(num==0) {
            return 1;
        }

            int count=0;
            while(num>0){
                count++;
                num/=10;
            }
            return count;
    }

    private static String armstrong(int num) {
        int originalNum = num;
        int digitCount = countDigits(num);
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digitCount);
            num /= 10;
        }

        return originalNum == sum ? "Yes" : "No";
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        System.out.println("Is it a Armstrong number?: "+armstrong(number));
        in.close();
    }
}
