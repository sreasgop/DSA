// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

import java.util.Scanner;

public class Q20_Pattern20 {
    public static void main(String[] args) {
    
       Scanner sc = new Scanner(System.in);
       System.out.print("Input n: ");
       int n = sc.nextInt();
       sc.close();

       pattern20(n);
        
    } 

    static void pattern20(int row){
        
        // Initializing Spaces out side of the main loop as space isn't dependent on the loop control variable 'i' directly. 
        int space = 2 * row - 2;

        for(int i = 1; i <= (2*row-1); i++) 
        {

            // Initializing Stars inside of the main loop as stars is directly dependent on the loop control variable 'i'.
            int stars = i;
            
            // Everytime stars is initialized we check if the value of star exceeded row, in case it dad we reassign the value of stars. We have to do this before printing the stars because otherwise stars will be printed for i times and then changing the stars by checking against rows will not have any impact whatsoever. 
            if(i>row) {
                stars = row - (i - row);
            }
            for(int j=0; j<stars; j++){
                System.out.print("*");
            }
        
            // In case of printing spaces however, we first print it once and then check the value of spaces against the rows, because space variable isn't dependent on loop control variable 'i'. Based on the value of i and row if i exceeds the value of row the variable space is either decremented by 2 or incremented by 2. As a result first we print it once and then compare it. 
            for(int k=1; k<=space; k++){
                System.out.print(" ");
            }
            if(i<row) {
                space = space - 2;
            } else {
                space = space + 2;
            }

            // Printing spaces again:
            for(int j=0; j<stars; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
