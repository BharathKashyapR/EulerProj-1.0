package net.projectEuler.problems;

public class Problem006 {

	public static void main(String[] args) {
		// Objective:Find the difference between the sum of the squares of the first one
		// hundred natural numbers and the square of the sum.
		long i = sumofSquares();
		long j = squareOfSum();
		System.out.println(j - i);

	}

	static long sumofSquares() {
		long sum = 0L;
		for (long i = 1; i <= 100; i++) {
			long val = i * i;
			sum = sum + val;
		}
		return sum;
	}

	static long squareOfSum() {
		long sum = 0L;
		for (long i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		return sum * sum;
	}
}
