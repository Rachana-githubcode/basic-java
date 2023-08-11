import java.util.*;

public class Array3 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the number :");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i=i+1) {
            System.out.println("Enter number");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter number to find index value :");

        int x = sc.nextInt();

        //output
        for(int i=0; i<=numbers.length; i=i+1) {
            if(numbers[i] == x) {
            System.out.println("x found at index :" +i);
            }
        }

    }
    
}
