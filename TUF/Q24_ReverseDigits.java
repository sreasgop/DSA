// Given an integer N return the reverse of the given number.

import java.util.Scanner;

public class Q24_ReverseDigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        reverseNum(n);

    }

    static void reverseNum(int num){
        int revNum = 0; 
        while(num!=0){
            revNum = revNum * 10 + (num % 10);
            num = num / 10;
        }
        System.out.printf("Output: %d\n", revNum);
    }
}
