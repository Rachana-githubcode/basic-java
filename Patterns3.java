import java.util.*;
public class Patterns3 {
    public static void main(String args[]) {
        int n = 4;
        for(int i=n; i>=1; i=i-1) {
            for(int j=1; j<=i; j=j+1) {
                System.out.print("*");
            }
            System.out.println("");
            }
        }
    }
    