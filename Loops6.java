import java.util.*;
public class Loops6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1; i<=num; i=i+1)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}