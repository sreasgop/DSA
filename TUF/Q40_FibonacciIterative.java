// Given an integer N. Print the Fibonacci series up to the Nth term.

import java.util.Scanner;

public class Q40_FibonacciIterative {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();

		NthFibo(n);
		System.out.println();
	}

	static void NthFibo(int num1) {

		int firstTerm = 0;
		int secondTerm = 1;
		int nextTerm = 0;

		for (int i = 0; i < num1; i++) {
			System.out.print(firstTerm + " ");
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
