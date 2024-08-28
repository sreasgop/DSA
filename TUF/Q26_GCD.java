// Given two integers N1 and N2, find their greatest common divisor.

import java.util.Scanner;

public class Q26_GCD {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n, m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

       System.out.println( gcd(n, m));

    }

    static int gcd(int num1, int num2){

        int commonFactor = 0;

        for(int i=1; i<Math.min(num1, num2); i++){
            if(num1%i==0 && num2%i==0){
                commonFactor = i;
            }
        }

        return commonFactor;
    }
}
