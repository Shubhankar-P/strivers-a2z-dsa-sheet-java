package Step1_Basics.Java_basics;

import java.util.Scanner;

public class e_whileLoop {
    public static void main(String[] args){
        int lives = 3;

        Scanner in = new Scanner(System.in);



        while(lives>0){
            System.out.println("************GAME**************");
            System.out.print("2 x 5 + 3 = ");
            int ans = in.nextInt();

            if(ans != 13){
                lives--;
                System.out.println("\nWrong Answer !!");
                System.out.println(lives+" lives remaining....");
            }else{
                System.out.println("Correct answer !!!");
                break;
            }
        }
        if(lives==0){
            System.out.println("***********GAME OVER************");
        }
        else{
            System.out.println("***********YOU WON!!!************");
        }
    }
}
