// Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2. 

import java.util.Scanner;

public class Q30_PrimeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = sc.nextInt();
		sc.close();

		checkPrime(n);

	}

	static void checkPrime(int num) {

		boolean is_prime = true;

		if (num <= 1) {
			is_prime = false;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					is_prime = false;
				}
			}
		}

		if (is_prime) {
			System.out.println("Prime: True");
		} else {
			System.out.println("Prime: False");
		}
	}
}
