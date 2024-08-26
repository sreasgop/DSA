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

        arrow(n);

    }

    public static void arrow(int row){
        
        // UPWARD Triangle:
        for(int i = 0;  i < row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // DOWNWARD Triangle:
        for(int i = 0; i < row-1; i++){
            for(int j = row-1; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
