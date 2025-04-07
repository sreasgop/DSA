// Given an array, we have to find the number of occurrences of each element in the array

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Q46_CountFrequency {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		// Take the array input and precomputer to generate hashmap as well:
		System.out.print("Enter array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
			} else {
				hashMap.put(arr[i], 1);
			}
		}

		sc.close();

		System.out.println("Value:\tFrequency:");

		// Print the HashMap:
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

	}
}
