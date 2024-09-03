// Given the string: “abcdabefc” we are given some queries: [a, c, z]. For each query, we need to find out how many times the character appears in the string. For example, if the query is ‘a’ our answer would be 2, and if the query is ‘z’ the answer will be 0.

import java.util.Scanner;

public class Q43_CharacterHashing {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		int[] hasharray = new int[26];

		for (int i = 0; i < str.length(); i++) {
			hasharray[str.toLowerCase().charAt(i) - 'a']++;
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
			char ch = sc.next().toLowerCase().charAt(0);
			System.out.print(hasharray[ch - 'a']);
		}

		sc.close();
	}

}
