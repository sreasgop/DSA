// Given a string, check if the string is palindrome or not. [Recursive Way]

import java.util.Scanner;

public class Q39_StringPalindromeRecursive {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input string: ");
		String str = sc.nextLine();
		sc.close();

		if (checkPalindrome(str, 0, str.length() - 1)) {
			System.out.println("Palindrome: True");
		} else {
			System.out.println("Palindrome: False");
		}

	}

	static boolean checkPalindrome(String str, int low, int high) {

		if (low >= high) {
			return true;
		} else if (str.toLowerCase().charAt(low) != str.toLowerCase().charAt(high)) {
			return false;
		}
		return checkPalindrome(str, low + 1, high - 1);

	}
}
