// Print N to 1 using recursion. 

import java.util.Scanner;

public class Q32_Recursion3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();

		printNums(n);
	}

	static void printNums(int num) {
		if (num == 0) {
			return;
		}
		System.out.print(num + " ");
		printNums(num - 1);
	}
}
