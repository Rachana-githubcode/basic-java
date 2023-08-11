import java.util.*;
public class Functionsfactorial {
    public static void printFactorial(int n) {
        if (n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;

        for(int i=n; i>=1; i=i-1) {
            factorial = factorial*i;
        }
        System.out.println( "Factorial of number: " +factorial);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        printFactorial(n);
    }
    }  

