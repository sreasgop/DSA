//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA

import java.util.Scanner;

public class Q17_Pattern17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        charPyramid(n);
        
    }

    public static void charPyramid(int row){
        int ascii = 65;
        
        for(int i=1; i<=row; i++){
            
            // Printing Spaces:
            for(int j=row; j>i; j--){
                System.out.print(" ");
            }

            for(int k=0; k<i; k++){
                System.out.print((char)(ascii+k));
            }

            for(int l = i-2; l>=0; l--){
                System.out.print((char)(ascii+l));
            }

            System.out.println();
        }
    }
}
