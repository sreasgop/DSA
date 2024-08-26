// 1
// 12
// 123
// 1234
// 12345

import java.util.Scanner;

public class Q03_Pattern3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();

		numRightTriangle(n);

	}

	public static void numRightTriangle(int row){
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
