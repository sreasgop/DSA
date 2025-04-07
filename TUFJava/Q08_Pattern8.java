// *********
//  *******
//   *****
//    ***
//     *

import java.util.Scanner;

public class Q08_Pattern8 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        downwardPyramid(n);
 
    }

    static void downwardPyramid(int row){

        for (int i = 0; i < row; i++) {

            // Inner-Loop for spaces 
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            
            // Inner-loop for 1st Up-side-down-triangle of stars
            for (int k = row; k > i; k--) {
                System.out.print("*");
            }

            // Inner-loop for 2nd Up-side-down-triangle of stars
            for(int l = row - 1; l > i; l--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}