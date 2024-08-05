import java.util.*;
public class InvRotpyr{
    // INVERTED AND ROTATED HALF PYRAMID
    // Always start by assuming it as a matrix and then build logic
    // outer loop for number of rows
    // inner loop for number of 
    // print spaces and stars ;    spaces = n - i
    // row number = no. of stars to be printed
    public static void inverted_rotated_half_pyramid(int n){
        // outer loop
        for (int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main (String args[]){
        inverted_rotated_half_pyramid(4);
    }
}