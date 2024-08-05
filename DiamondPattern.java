import java.util.*;
public class DiamondPattern{
    public static void Diamond(int n){
        // outer loop - 1st half
        for(int i=1; i<=n; i++){
            // inner loop 
            // some spaces then stars
            // whenever u see that i is increasing and spaces r decreasing check for n-i relation

            // spaces = n-i
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars = 2*(i)-1
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Second half 
        for(int i=n; i>=1; i--){
            // spaces = n-i
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars = 2*(i)-1
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Diamond(4);
    }
}