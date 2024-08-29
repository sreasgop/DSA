// Understand recursion by printing something n times.

import java.util.Scanner;

public class Q30_Recursion1 {
	public static void main(String[] args) {

		java.util.Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();

		printName(n);
	}

	static void printName(int n) {
		if (n == 0) {
			return;
		} else {
			System.out.println("CSGS");
			printName(n - 1);
		}
	}
}
