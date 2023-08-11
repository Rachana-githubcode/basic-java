import java.util.*;
public class Patterns6 {
    public static void main(String args[]) {
        int n=6;
        for(int i=1; i<=n; i=i+1) {
            for(int j=1; j<=n-i; j=j+1) {  //j<=n-i+1;
                System.out.print(j+" ");
            }
            System.out.println("");
        }

    }
}