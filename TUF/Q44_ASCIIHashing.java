// Given any string, then we are given some queries. For each query, we need to find out how many times the character appears in the string.
// Any ASCII characters should have their frequency counted individually. 'A' and 'a' should be treated differently as they below to difference cases.

import java.util.Scanner;

public class Q44_ASCIIHashing {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();

		// ASCII characters go up to corresponding values of 256 and that's why we would
		// need a hash array of 256 elements.
		int[] hashArray = new int[256];

		for (int i = 0; i < str.length(); i++) {
			hashArray[str.charAt(i)]++;
		}

		System.out.print("Number of characters to check for frequency: ");
		int n = sc.nextInt();
		System.out.print("Enter the characters: ");

		// Flushing the input buffer
		while (sc.hasNext()) {
			String buffer = sc.nextLine();
			if (buffer.isEmpty()) {
				break;
			}
		}

		while (n-- != 0) {
			char ch = sc.next().charAt(0);
			System.out.print(hashArray[ch]);
		}
		sc.close();
	}
}
