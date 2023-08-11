import java.util.*;
public class Patterns4 {
    public static void main(String args[]) {
        int n = 4;
        for(int i=1; i<=n; i=i+1) {
            for(int j=1; j<=n-i; j=j+1) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j=j+1) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    }
}
