import java.util.*;
public class Patterns7 {
    public static void main(String args[]) {
        int n=15;
        for(int i=1; i<=n; i=i+1) {
            for(int j=1; j<=i; j=j+1) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}