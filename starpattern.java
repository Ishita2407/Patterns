import java.util.*;
public class starpattern{
    public static void main(String args[]){
        // outer loop - number of lines to be printed
        // inner loop - number of stars to be printed in each line
        // what is to be printed ?
        for(int line=1; line<=4; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}