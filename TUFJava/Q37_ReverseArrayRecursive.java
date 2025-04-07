// Reverse an array using recursive method.

import java.util.Scanner;

public class Q37_ReverseArrayRecursive {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.print("Enter array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		reverseArray(arr, 0, n - 1);

		System.out.print("Reversed Array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		sc.close();

	}

	static void reverseArray(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
		reverseArray(arr, low + 1, high - 1);
	}
}
