package Step1_Basics.a_Java_basics;

import java.util.Scanner;

public class d_forLoop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Till which number do you want to print ? ");
        int num= in.nextInt();

        for(int i=1; i<=num; i++){
            System.out.println(i);
        }

        in.close();
    }
}
