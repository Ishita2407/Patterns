import java.util.*;
public class SolidRhombusPattern{
    public static void Solid_Rhombus(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop 
            // some space then stars 
            // spaces

            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }

            // stars - number of stars will always be equal to n
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        Solid_Rhombus(5);
    }
}