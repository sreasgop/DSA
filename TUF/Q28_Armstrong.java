// Given an integer N, return true it is an Armstrong number otherwise return false.

import java.util.Scanner;

public class Q28_Armstrong {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        checkArmstrong(n);

    }

    static void checkArmstrong(int num){
        
        int numCopy = num;
        int sum = 0; 

        // Counting the number of digits:
        int count = 0;
        while(num!=0){
            num /= 10;
            count++;
        }

        // Calculating the sum of all digits raised to the number of digits: 
        num = numCopy;
        while(num!=0){
            sum += Math.pow((num % 10), count);
            num /= 10;
        }

        if(numCopy==sum){
            System.out.println("Armstrong: True");
        } else{
            System.out.println("Armstrong: False");
        }
    }

}
