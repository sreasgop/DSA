// *****
// *****
// *****
// *****
// *****

import java.util.Scanner;

public class Q01_Pattern1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Input n: ");
		int n = sc.nextInt();
		System.out.println();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
