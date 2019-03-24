package net.projectEuler.problems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem0007 {
	public static void main(String[] args) {
		List<Integer> primeNumber = IntStream.rangeClosed(2, 120000).boxed().collect(Collectors.toList());
		// Use Sieve of Eratosthenes Algorithm.
		int index = 0;
		for (int i = 0; i < primeNumber.size(); i++) {
			int value = primeNumber.get(i);
			// 2
			for (int j = 0; j < primeNumber.size(); j++) {
				int jValue = primeNumber.get(j);
				if (value != jValue) {
					if (jValue % value == 0) {
						primeNumber.remove(j);
					}
				}
			}

		}
		// 10000
		System.out.println(primeNumber.get(10000));

	}

}
