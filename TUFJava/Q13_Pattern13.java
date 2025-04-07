// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

import java.util.Scanner;

public class Q13_Pattern13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        numTriangle(n);

    }

    public static void numTriangle(int row){
        int count = 0;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }


}