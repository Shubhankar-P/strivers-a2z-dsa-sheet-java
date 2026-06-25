package Step1_Basics.Maths_basics;

import java.util.Scanner;

public class e_PrintDivisors {
    private static void printDivisors(int num){
        for(int i=1; i*i<=num; i++){
            if(num%i==0){
                System.out.println(i);

                if (i != num / i) {
                    System.out.println(num / i);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        System.out.println("\nDivisors: ");
        printDivisors(number);
        in.close();
    }
}
