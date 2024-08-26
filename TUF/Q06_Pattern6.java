// 12345
// 1234
// 123
// 12
// 1

import java.util.Scanner;

public class Q06_Pattern6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();

		downwardNumTriangle(n);

	}

	public static void downwardNumTriangle(int row){
		for (int i = row; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
