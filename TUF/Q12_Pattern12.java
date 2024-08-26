// 1      1
// 12    21
// 123  321
// 12344321

import java.util.Scanner;

public class Q12_Pattern12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        numTriangle(n);

    }

    public static void numTriangle(int row){
        for(int i = 1; i < row; i++){

            // 1st Num Triangle
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            
            // Space Pyramid:
            for(int k = row - 1; k > i; k--){
                System.out.print(" ");
            }

            for(int l = row - 1; l > i; l--){
                System.out.print(" ");
            }

            // 2nd Num Triangle
           for(int m = i; m > 0; m--){
                System.out.print(m);
           } 

            System.out.println();
        }
    }
}