// Given an array of integers: [1, 2, 1, 3, 2] and we are given some queries: [1, 3, 4, 2, 10]. For each query, we need to find out how many times the number appears in the array. For example, if the query is 1 our answer would be 2, and if the query is 4 the answer will be 0.

import java.util.Scanner;

public class Q42_IntegerHashing {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.print("Enter " + n + " integers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] hasharray = hashArr(arr);

		System.out.print("Number of elements to look up: ");
		int size = sc.nextInt();

		System.out.printf("Enter %d elements to look up: ", size);
		System.out.println("Frequency: ");
		while (size-- != 0) {
			int num = sc.nextInt();
			System.out.print(hasharray[num] + " ");
		}

		sc.close();
	}

	static int[] hashArr(int arr[]) {
		int[] hash = new int[2000];
		for (int i = 0; i < arr.length; i++) {
			hash[arr[i]] = hash[arr[i]] + 1;
		}

		return hash;
	}
}
