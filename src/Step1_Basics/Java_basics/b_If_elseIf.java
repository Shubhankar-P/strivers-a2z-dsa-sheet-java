package Step1_Basics.Java_basics;

import java.util.Scanner;

public class b_If_elseIf {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = in.nextInt();
        String stage;

        if(age<=25){
            stage = "Brahmacharya";
        }
        else if(age>25 && age<=50){
            stage = "Grihastha";
        }
        else if(age>50 && age<=75){
            stage = "Vanaprastha";
        }
        else{
            stage = "Sanyaas";
        }

        System.out.println("Your current stage of life: "+stage);
        in.close();
    }
}
