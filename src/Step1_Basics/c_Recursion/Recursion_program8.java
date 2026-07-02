package Step1_Basics.c_Recursion;

import java.util.Scanner;

// Check if String is Palindrome or not
public class Recursion_program8 {
    private static boolean palindrome(String s, int left, int right){
        if(left >= right){
            return true;
        }

        if(s.charAt(left) != s.charAt(right)){
            return false;
        }

      return palindrome(s, left+1, right-1);
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String name = in.nextLine().toLowerCase();
        in.close();
        System.out.println("is Palindrome? ");
        System.out.println( palindrome(name, 0, name.length()-1) ? "Yes" : "No");
    }
}
