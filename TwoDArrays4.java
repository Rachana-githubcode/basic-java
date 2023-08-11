import java.util.*;

public class TwoDArrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows :");
        int m = sc.nextInt();
        System.out.println("Enter the columns :");
        int n = sc.nextInt();

        int matrix1[][] = new int[n][m];
        int matrix2[][] = new int[m][n];
        int matrix3[][] = new int[m][n];

        System.out.println("Enter first matrix :");
        for(int i=0; i<m; i=i+1) {
            {
                for(int j=0; j<n; j=j+1) {
                    matrix1 [i][j]= sc.nextInt(); 
                }
            }
        }
        System.out.println("Enter first matrixes :");
        for(int i=0; i<m; i=i+1) {
                for(int j=0; j<n; j=j+1) {
                    System.out.print(matrix1[i][j] +" ");
                }
                System.out.println(" ");
            }
        System.out.println("Enter second matrix :");
        for(int i=0; i<m; i=i+1) {
            {
                for(int j=0; j<n; j=j+1) {
                    matrix2[i][j]= sc.nextInt(); 
                }
            }
        }
        for(int i=0; i<m; i=i+1) {
                for(int j=0; j<n; j=j+1) {
                    System.out.print(matrix2[i][j] +" ");
                }
                System.out.println(" ");
            }
            for(int i=0; i<m; i=i+1) {
            for(int j=0; j<n; j=j+1) {
              matrix3[i][j] =matrix1[i][j] + matrix2[i][j];
            }
           } 
           System.out.println("Sum of matrix :");
           for(int i=0; i<m; i=i+1) {
            for(int j=0; j<n; j=j+1) {
              matrix3[i][j] =matrix1[i][j] + matrix2[i][j];
            }
           } 
           for(int i=0; i<m; i=i+1) {
            for(int j=0; j<n; j=j+1) {
              System.out.print(matrix3[i][j] +" ");
            }
            System.out.println(" ");
           }    
    }    
}
