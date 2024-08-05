import java.util.*;
public class ZeroneTriangle{
    public static void Zero_one_Triangle(int n){

        // observe the pattern - 1 is printed for cell (i,j) when i+j = even number
        // 0 is printed for i+j = odd number
        // i is outer loop iterator
        // j is inner loop iterator
        // outer loop 
        for(int i=1; i<=n; i++){
            // row number = number of elements to be printed in that row
            for(int j=1; j<=i; j++){
                if((i+j)% 2 == 0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Zero_one_Triangle(5);
    }

}

/* 1
   0 1
   1 0 1
   0 1 0 1
   1 0 1 0 1 */