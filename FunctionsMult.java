import java.util.*;
public class FunctionsMult {
    public static int calculateMult(int a, int b) {
        int mult = a*b;
        return mult;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = sc.nextInt();
        System.out.println("Enter the num2");
        int b = sc.nextInt();
        
        int mult = calculateMult(a,b);
        System.out.println("Multiply of two numbers :"+mult);
    }
    
}
