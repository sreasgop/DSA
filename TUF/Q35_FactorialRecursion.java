// Print the factorial of N (Using Recursion).

import java.util.Scanner;

public class Q35_FactorialRecursion {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();

		System.out.printf("%d! = %d\n", n, factFun(n));
		fact(n, 1);
	}

	// Printing the factorial of n using the parameterized recursive approach
	static void fact(int num, int fact) {
		if (num < 1) {
			System.out.println("Factorial: " + fact);
			return;
		}
		fact(num - 1, fact * num);
	}

	// Returning the factorial of a n using the functional recursive approach.
	static int factFun(int num) {
		if (num == 0) {
			return 1;
		}
		return num * factFun(num - 1);
	}
}
