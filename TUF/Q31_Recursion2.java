// Print 1 to N using recursion

import java.util.Scanner;

public class Q31_Recursion2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();

		printNum(n);
	}

	static int count = 1;

	static void printNum(int num) {
		if (count > num) {
			return;
		}

		System.out.print(count++ + " ");
		printNum(num);
	}
}
