import java.util.*;
public class Loops3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print table:");
        int num = sc.nextInt();
        for(int i=1; i<=10; i=i+1) {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}