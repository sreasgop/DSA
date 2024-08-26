// 1
// 01
// 101
// 0101
// 10101

import java.util.Scanner;

public class Q11_Pattern11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input n: ");
        int n = sc.nextInt();
        
        sc.close();

        binaryTriangle(n);
    }

    public static void binaryTriangle(int row){
        
        int start = 1;

        for(int i = 0; i < row; i++){
            
            // In this pattern we can see that for even number of i, printing starts with 1 and otherwise the printing starts with 0. As a result here we assign the value to start printing from by checking if i is even or odd. 
            if(i%2 == 0){
                start = 1;
            } else {
                start = 0;
            }

            for(int j = 0; j <= i; j++){
                System.out.print(start);    
                start = 1 - start;      // We perform a binary fliping after printing the number:  1 - 0 = 1  and  1 - 1 = 0                        
            }
            System.out.println();
        }
    }

}
