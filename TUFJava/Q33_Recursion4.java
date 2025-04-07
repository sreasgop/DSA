// Sum of first N natural numbers.

import java.util.Scanner;

public class Q33_Recursion4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();

		System.out.printf("Sum of first %d natural numbers: %d\n", n, sumOfNFunctional(n));
		sumOfNParameterized(n, 0);
	}

	// Parameterized Way of printing the sum of first n natural numbers using
	// recursion.
	static void sumOfNParameterized(int num, int sum) {
		if (num < 1) {
			System.out.println("Sum: " + sum);
			return;
		}
		sumOfNParameterized(num - 1, sum + num);
	}

	// Functional Way of returning the sumof first n natural numbers using
	// recursion.
	static int sumOfNFunctional(int num) {
		if (num == 0) {
			return 0;
		}
		return num + sumOfNFunctional(num - 1);
	}
}
