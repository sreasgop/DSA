// 1
// 22
// 333
// 4444
// 55555

import java.util.Scanner;

public class Q04_Pattern4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();

		numTriangle(n);
	
	}

	public static void numTriangle(int row){
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
