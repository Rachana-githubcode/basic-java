import java.util.*;

public class TwoDArrays3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows :");
        int n = sc.nextInt();
        System.out.println("Enter columns:");
        int m = sc.nextInt();

        System.out.println("Enter value of matrix :");
        int matrix[][] = new int[n][m];

        for(int i=0; i<n; i=i+1) {
            for(int j=0; j<m; j=j+1) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");

        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        //To print spiral order matrix 
        while(rowStart <= rowEnd && colStart <= colEnd) {

            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(matrix[rowStart][col] +" ");
            }
            rowStart++;


            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] +" ");
            }
            colEnd--;

            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;


            for(int row=rowEnd; row<=rowStart; row--) {
                System.out.print(matrix[row][colStart] +" ");
            }
            colStart++;

            System.out.println();

        }
    }
    
}
