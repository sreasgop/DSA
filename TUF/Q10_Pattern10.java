// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

import java.util.Scanner;

public class Q10_Pattern10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        improvedPatern10(n);

    }

    // public static void arrow(int row){
        
    //     // UPWARD Triangle:
    //     for(int i = 0;  i < row; i++){
    //         for(int j = 0; j <= i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     // DOWNWARD Triangle:
    //     for(int i = 0; i < row-1; i++){
    //         for(int j = row-1; j > i; j--){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    // }

    static void improvedPatern10(int row){
        
        for(int i = 1; i <= (2*row-1); i++) 
        {
            // Stars: 
            int stars = i; 
            if(i>row) {
                stars = row - (i - row);
            }

            for(int j=0; j<stars; j++){
                System.out.print("*");
            }
            System.out.println();   

        }
    }

}
