// Given an integer N. Print the Fibonacci series up to the Nth term. (Using Recursive Approach)

import java.util.Scanner;

public class Q41_FibonacciRecursive {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();

		System.out.println(fibonacci(n));

	}

	static int fibonacci(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		}
		return fibonacci(num - 1) + fibonacci(num - 2);
	}
}
