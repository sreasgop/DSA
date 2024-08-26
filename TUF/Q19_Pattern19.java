
import java.util.Scanner;

public class Q19_Pattern19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        spaceDiamond(n);

    }   
    
    public static void spaceDiamond(int row){
        
        // Outer-loop for Upper Pyramid
        for(int i=0; i<row; i++){
            
            // First Upper triangle:
            for(int j = row; j > i; j--){
                System.out.print("*");
            }

            // First Space triangle:
            for(int k = 0; k < i; k++){
                System.out.print("  ");
            }

            // Second Upper Triangle:
            for(int m = row; m > i; m--){
                System.out.print("*");
            }
            System.out.println();

        }

        // Outer-loop for Down Pyramid:
        for(int i=0; i<row; i++){
            
            // First Upper triangle:
            for(int j = 0; j <=i; j++){
                System.out.print("*");
            }

            // Space triangle:
            for(int k = row - 1; k > i; k--){
                System.out.print("  ");
            }

            // Second Upper Triangle:
            for(int m = 0; m <= i; m++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
    
}
