import java.util.*;
public class Add1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st number");
        int a = sc.nextInt();
        System.out.println("Enter a 2nd number");
        int b = sc.nextInt();

        int sum=a+b;
        System.out.println("Sum :" +sum);
    }
}