package net.projectEuler.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem003 {

	/*
	 * Following are the steps to find all prime factors.
	 * 
	 * 
	 * 1) While n is divisible by 2, print 2 and divide n by 2.
	 * 
	 * 2) After step 1, n must be odd. Now start a loop from i = 3 to square root of
	 * n. While i divides n, print i and divide n by i, increment i by 2 and
	 * continue.
	 * 
	 * 3) If n is a prime number and is greater than 2, then n will not become 1 by
	 * above two steps. So print n if it is greater than 2.
	 */
	public static void main(String[] args) {

		long n = 600851475143L;
//		long n = 315;
		primeFactors(n);

	}

	public static void primeFactors(long n) {
		List<Integer> numbers = new ArrayList<Integer>();
		while (n % 2 == 0) {
			System.out.println(2 + " ");
			numbers.add(2);
			n = n / 2;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
		if (n > 2)
			System.out.print(n);

	}
}
