// Reverse an array using iterative method.

import java.util.Scanner;

public class Q36_ReverseArrayIterative {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.print("Enter array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		reverseArray(arr, n);

		System.out.print("Reversed Array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void reverseArray(int[] arr, int size) {
		for (int i = 0, j = size - 1; i < size / 2; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
