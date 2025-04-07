//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *

import java.util.Scanner;

public class Q09_Pattern9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = sc.nextInt();

        sc.close();
        
        diamond(n);

    }
    
    public static void diamond(int row){
        
        // UPWARD Pyramid:
        for(int i = 0; i < row; i++){

            // Inner-loop to print the spaces: 
            for(int j = row - 1; j > i; j--){
                System.out.print(" ");
            }
            
            // Inner-loop to print the 1st UPWARD triangle:
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }
            
            // Inner-loop to print the 2nd UPWARD triangle: 
            for(int l = 0; l <=i-1; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        // DOWNWARD Pyramid:
        for(int i = 0; i < row; i++){

            // Inner-loop to print the spaces: 
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            // Inner-loop to print the 1st DOWNWARD triangle:
            for(int k = row; k > i; k--){
                System.out.print("*");
            }

            // Inner-loop to print the 2nd DOWNWARD triangle:
            for(int l = row - 1; l > i; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
