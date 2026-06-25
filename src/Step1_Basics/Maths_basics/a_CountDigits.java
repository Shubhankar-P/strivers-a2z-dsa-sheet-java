package Step1_Basics.Maths_basics;

import java.util.Scanner;

public class a_CountDigits {
    private static int countDigits(long num){
        if(num==0){
            return 1;
        }
        else{
            int count=0;
            while(num>0){
                count++;
                num/=10;
            }
            return count;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = in.nextLong();

        System.out.println("No. of Digits: "+countDigits(number));
        in.close();
    }
}
