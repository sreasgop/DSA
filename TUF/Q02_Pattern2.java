// *
// **
// ***
// ****
// *****

import java.util.Scanner;

public class Q02_Pattern2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Input n: ");
		int n = sc.nextInt();	// Rows of Pattern
		System.out.println();
		sc.close();
		

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
