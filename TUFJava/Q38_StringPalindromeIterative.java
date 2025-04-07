// Given a string, check if the string is palindrome or not."  A string is said to be palindrome if the reverse of the string is the same as the string.

import java.util.Scanner;

public class Q38_StringPalindromeIterative {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input String: ");
		String str = sc.nextLine();
		sc.close();

		if (isPalindrome(str)) {
			System.out.println("Palindrome: True");
		} else {
			System.out.println("Palindrome: False");
		}
	}

	static boolean isPalindrome(String str) {
		int lastCharIndex = str.length() - 1;
		for (int i = 0; i <= str.length() / 2; i++) {
			if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(lastCharIndex - i)) {
				return false;
			}
		}
		return true;
	}
}
