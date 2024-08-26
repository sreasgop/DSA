//      *
//     ***
//    *****
//   *******
//  *********

import java.util.Scanner;

public class Q07_Pattern7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        upwardPyramid(n);

    }

    public static void upwardPyramid(int row){
        for (int i = 0; i < row; i++) {
            
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            
            
            for(int l = 0; l<=i-1; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
