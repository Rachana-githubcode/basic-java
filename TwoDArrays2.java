import java.util.*;

public class TwoDArrays2 { 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows :");
        int rows = sc.nextInt();
        System.out.println("Enter Columns :");
        int cols = sc.nextInt();
        
        System.out.println("Enter matrix value:");
        int[][] numbers = new int[rows][cols];

        //input
        //rows
        for(int i=0; i<rows; i=i+1) {
            //cols
            for(int j=0; j<cols; j=j+1) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number to be found :");
        int x=sc.nextInt();

        for(int i=0; i<rows; i=i+1) {
            for(int j=0; j<cols; j=j+1) {
                //compare with x
                if(numbers[i][j] == x)
                System.out.println("x found at location :" +i+ ","+j);
            }
        }
        
    }

    
}