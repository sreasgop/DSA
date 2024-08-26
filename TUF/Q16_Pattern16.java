// A
// BB
// CCC
// DDDD
// EEEEE

import java.util.Scanner;

public class Q16_Pattern16 {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        charTriangle(n);

    }

    public static void charTriangle(int row){
        
        int asciiValue = 65;

        for(int i=0; i<row; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)(asciiValue+i));
            }
            System.out.println();
        }     
    }

}
