import java.util.*;
public class Functions2 {
    public static int calculateAverage(int a, int b, int c) {
        int sum = a+b+c;
        int avg = sum/3;
        return avg;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int a = sc.nextInt();
        System.out.println("Enter num2 :");
        int b = sc.nextInt();
        System.out.println("Enter num3 :");
        int c = sc.nextInt();

        int avg = calculateAverage(a, b, c);
        System.out.println("Average of num :"+avg);
    }
    
}
