// Given an integer N, return true if it is a palindrome else return false.

import java.util.Scanner;

public class Q25_PalindromeInt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        checkPalindrome(n);
    }

    static void checkPalindrome(int num){

        int numCopy = num;
        int revNum = 0; 

        while(num!=0){
            revNum = revNum * 10 + (num % 10);
            num/=10;
        }

        if(numCopy == revNum){
            System.out.println("Palindrome: True");
        } else {
            System.out.println("Palindrome: False");
        }
    } 
}
