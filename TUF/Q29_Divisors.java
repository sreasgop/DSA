// Given an integer N, return all divisors of N.

import java.util.Scanner;

public class Q29_Divisors {
   public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        printDivisors(n);
   }

   static void printDivisors(int num){
        System.out.printf("Divisors of %d are: ", num);
        for(int i=1; i<=num; i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
   }
}
