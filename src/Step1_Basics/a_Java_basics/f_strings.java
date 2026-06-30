package Step1_Basics.a_Java_basics;

import java.util.Scanner;

public class f_strings {
        public static void main(String[]args){
            int choice;
            Scanner in = new Scanner(System.in);

            System.out.print("Enter the String: ");
            String word = in.nextLine();

            do{
                System.out.println("*************The Strings Game*****************");
                System.out.println("1. Print String");
                System.out.println("2. Print length");
                System.out.println("3. Access character");
                System.out.println("4. Convert to Uppercase");
                System.out.println("5. Convert to Lowercase");
                System.out.println("6. Check contains");
                System.out.println("7. Traverse Characters");
                System.out.println("8. Exit");

                System.out.print("\nEnter your choice: ");
                choice = in.nextInt();

                switch(choice){
                    case 1:
                        System.out.println(word);
                        break;
                    case 2:
                        System.out.println(word.length());
                        break;
                    case 3:
                        System.out.print("Enter index of character you want to access: ");
                        int n = in.nextInt();
                        if(n>=0 && n<word.length()) { System.out.println(n + " character is: " + word.charAt(n));}
                        else{ System.out.println("Invalid Index !");}
                        break;
                    case 4:
                        System.out.print("Converted to Uppercase: "+ word.toUpperCase());
                        break;
                    case 5:
                        System.out.print("Converted to Lowercase: "+ word.toLowerCase());
                        break;
                    case 6:
                        System.out.print("Enter text to search: ");
                        in.nextLine();
                        String search = in.nextLine();

                        if(word.contains(search)){
                            System.out.println("Found!!");
                        }
                        else{System.out.println("Not found!");}
                        break;
                    case 7:
                        for(int i=0; i<word.length(); i++){
                            System.out.println(word.charAt(i));
                        }
                        break;
                    case 8:
                        System.out.println("Exiting the game.......");
                        break;
                }

                System.out.println("\n***********************************************\n");
            }while(choice != 6);

        }
}

