import java.util.*;

public class TwoDArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = sc.nextInt();
        System.out.println("Enter columns");
        int cols = sc.nextInt();

        System.out.println("Enter matrix value:");
        int[][] numbers = new int[rows][cols];

        //input
        //rows
        for(int i=0; i<rows; i=i+1) {
            //columns
            for(int j=0; j<cols; j=j+1) {
                
                 numbers[i][j] = sc.nextInt();

            }
        }
        System.out.println("Matrix value is :");
        for(int i=0; i<rows; i=i+1) {
            for(int j=0; j<cols; j=j+1) {
                System.out.print(numbers[i][j] +" "); 
            }
            System.out.println();
        }
    }
    
}
