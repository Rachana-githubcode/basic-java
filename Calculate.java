import java.util.*;
public class Calculate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("Sum of two numbers :"+sum);
        int sub = a-b;
        System.out.println("Subtraction of two numbers :"+sub);
        int mult = a*b;
        System.out.println("Multiply of two numbers :"+mult);
        int div = a/b;
        System.out.println("Division of two numbers :"+div);
        int mod = a%b;
        System.out.println("Modulas of two numbers :"+mod);
    }
}