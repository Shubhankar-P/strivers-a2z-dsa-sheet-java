package Step1_Basics.Java_basics;

import java.util.Scanner;

public class e_doWhileLoop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int balance = 10000;
        int choice;

        do {
            System.out.println("*************ATM machine**************");
            System.out.println("1. Debit");
            System.out.println("2. Credit");
            System.out.println("3. Show balance");
            System.out.println("4. Exit");
             choice = in.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter amount to debit: ");
                    int debit = in.nextInt();
                    if(debit<balance) {
                        balance -= debit;
                        System.out.println(debit + " Rupees debited successfully");
                    }
                    else{
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to credit: ");
                    int credit = in.nextInt();
                    balance += credit;
                    System.out.println(credit + " Rupees credited successfully");
                    break;
                case 3:
                    System.out.println("Your current Balance: "+balance);
                    break;
                case 4:
                    System.out.println("Exiting........");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }while(choice!=4);


    }
}
