// F
// E F
// D E F
// C D E F
// B C D E F
// A B C D E F

import java.util.Scanner;

public class Q18_Pattern18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        charTriangle(n);

    }
    
    public static void charTriangle(int row){
        
        int ascii = 65 + row;

        for(int i = 1; i <=row; i++){
            ascii = ascii - 1;
            for(int j = 0; j<i; j++){
                System.out.print((char)(ascii+j)+" ");
            }
            System.out.println();
        }
    }
}
