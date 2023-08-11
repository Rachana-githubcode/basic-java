import java.util.*;
public class Switch2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print day :");
        int n = sc.nextInt();
        // int n=1;
        switch(n) {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thrusday");
            break;
            case 5: System.out.println("Friday");
            break; 
            case 6: System.out.println("Saturday");
            break;
            default: System.out.println("Sunday");

        }

    }
}