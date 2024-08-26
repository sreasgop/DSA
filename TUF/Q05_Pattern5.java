// *****
// ****
// ***
// **
// *

import java.util.Scanner;

public class Q05_Pattern5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();		

		downwardTriangle(n);
	}

	public static void downwardTriangle(int row){
		for (int i = row; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
