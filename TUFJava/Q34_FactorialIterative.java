// Print the factorial of N (Using Iterative Way).

import java.util.Scanner;

public class Q34_FactorialIterative {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();

		System.out.printf("%d! = %d\n", n, factorial(n));
	}

	static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
}
