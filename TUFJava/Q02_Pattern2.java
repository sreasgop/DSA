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
		sc.close();
		
		rightTriangle(n);

	}

	public static void rightTriangle(int row){
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}