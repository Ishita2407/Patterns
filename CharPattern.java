import java.util.*;
public class CharPattern{
    public static void main(String args[]){
        int n=4;
        char ch = 'A';

        // outer loop- for line
        for(int i=1; i<=n; i++){
            
            // inner loop - for char
            for(int j=1; j<=i; j++){   // line number = no. of characters printed in that line
                // Each time the char will be incremented by 1 and will be printed
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}