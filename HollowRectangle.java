import java.util.*;
public class HollowRectangle{
    public static void hollow_rectangle(int totRows , int totCols){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                // cell-(i,j)
                if(i==1 || i == totRows || j ==1 || j == totCols){
                    // boundary cells
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        // Outer loop - for total number of rows
        // Inner loop - for total number of columns
        // Boundary = row: 1,4  col - 1,5
        hollow_rectangle(4,5);
    }
}