import java.util.*;
public class InvPyrNo{
    public static void inverted_half_pyramid_of_num(int n){
        // 1 to n-i+1 is printed in each row
        for(int i=1; i<=n; i++){
            // inner loop - numbers
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        inverted_half_pyramid_of_num(5);
    }
}















/*  1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1         */
