package Step1_Basics.a_Java_basics;

import java.util.Arrays;
import java.util.Scanner;

public class f_arrays {
    public static void main(String[]args){
        int choice;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of inputs: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }

        do{
            System.out.println("*************The Arrays Game*****************");
            System.out.println("1. Print array");
            System.out.println("2. Print length of array");
            System.out.println("3. Access an element");
            System.out.println("4. Update an element");
            System.out.println("5. Calculate sum");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");
            choice = in.nextInt();

            switch(choice){
                case 1:
                    System.out.println(Arrays.toString(arr));
                    break;
                case 2:
                    System.out.println("Length of the array: "+ arr.length);
                    break;
                case 3:
                    System.out.print("Which element do you want to access: ");
                    int n = in.nextInt();
                    if(n>=0 && n<arr.length) { System.out.println(n + " element is: " + arr[n]);}
                    else{ System.out.println("Invalid Index !");}
                    break;
                case 4:
                    System.out.print("Index of element to update: ");
                    n = in.nextInt();
                    if(n>=0 && n<arr.length){
                        System.out.print("New number: ");
                        int update = in.nextInt();
                        arr[n] = update;
                        System.out.println("Updated the element successfully!");
                    }
                    else{System.out.print("Invalid Index !");}
                    break;
                case 5:
                    int sum=0;
                    for(int num: arr){
                        sum += num;
                    }
                    System.out.println("Sum of array elements: "+sum);
                    break;
                case 6:
                    System.out.println("Exiting the game.......");
                    break;
            }

            System.out.println("***********************************************\n");
        }while(choice != 6);

    }
}
