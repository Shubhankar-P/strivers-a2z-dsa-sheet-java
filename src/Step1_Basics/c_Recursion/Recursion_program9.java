package Step1_Basics.c_Recursion;

public class Recursion_program9 {
    private static int fibonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }

    private static void printFibonacciSeries(int n, int current, int next){
        if (n == 0) {
            return;
        }

        System.out.print(current + " ");
        printFibonacciSeries(n-1, next, current+next);
    }

    public static void main(String[] args){
        System.out.println("Nth Fibonacci number: "+fibonacci(5));
        System.out.print("Fibonacci series: ");
        printFibonacciSeries(8, 0,1);
    }


}
