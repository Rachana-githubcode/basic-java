import java.util.*;
public class Conditions3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();

        if(a == b) {
            System.out.println("Equal");
        } else {
            if(a > b) {
                System.out.println("Greater");
            } else {
                System.out.println("Lesser");
            }
        }
    }
}
