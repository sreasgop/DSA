// Given an integer N, return all divisors of N.

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Q29_Divisors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = sc.nextInt();
        sc.close();

        printDivisorsImproved(n);
    }

    // static void printDivisors(int num) {
    // System.out.printf("Divisors of %d are: ", num);
    // for (int i = 1; i <= num; i++) {
    // if (num % i == 0) {
    // System.out.print(i + " ");
    // }
    // }
    // }

    static void printDivisorsImproved(int num) {

        List<Integer> listObj = new ArrayList<>();

        int limit = (int) Math.sqrt(num);
        for (int i = 1; i < limit; i++) {
            if (num % i == 0) {
                listObj.add(i);
                if (num / i != i) {
                    listObj.add(num / i);
                }
            }
        }

        Collections.sort(listObj);

        for (int i : listObj) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
