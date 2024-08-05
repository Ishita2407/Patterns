import java.util.*;
public class ButterflyPattern{
    public static void Butterfly(int n){
        // 1st half
        // outer loop
        for(int i=1; i<=n; i++){
            // stars - i
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars - i
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Second half
        for (int i=n; i>=1; i--){
            // stars - i
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars - i
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Butterfly(4);
    }
}



// i =1  stars = 1
// i=2   stars = 2 on both sides
// first print i stars then some no. of spaces then i no. of stars
// total no. of spaces will always be an even number 
// stars = i and spaces = 2(n-i)