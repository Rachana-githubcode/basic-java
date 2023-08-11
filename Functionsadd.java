import java.util.*;
public class Functionsadd {
    public static int calculateAdd(int a, int b) {
        int sum =a+b;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int a = sc.nextInt();
        System.out.println("Enter num2");
        int b = sc.nextInt();

        int sum = calculateAdd(a, b);
        System.out.println("Sum of two numbers: "+ sum);
    }
}