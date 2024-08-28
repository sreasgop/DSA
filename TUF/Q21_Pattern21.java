// * * * * *
// *       *
// *       *
// *       *
// * * * * *

import java.util.Scanner;

public class Q21_Pattern21 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        square(n);
        
    }

    static void square(int row){
        for(int i=0; i<row; i++){
            for(int j=0; j<row; j++){
                if(i == 0 || i == row-1 || j == 0 || j == row -1 ){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
