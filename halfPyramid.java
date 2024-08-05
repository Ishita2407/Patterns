import java.util.*;
public class halfPyramid{
    public static void main(String args[]){
        // outer loop - runs from 1 to n 
        // inner loop - will print the numbers from 1 to n
        // print the inner loop count 
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);  // values of inner loop will be printed in the same line
            }
            System.out.println();
        }
    }
}