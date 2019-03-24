/**
 * 
 */
package net.projectEuler.problems;

import java.awt.print.Printable;

/**
 * @author T3726
 *
 */
/*
 * Problem statement
 * "values do not exceed four million, find the sum of the even-valued terms"
 */
public class Problem002 {
	static int i = 1;
	static int j = 2;

	public static void main(String[] args) {
		int sum = 2;
		while (j < 4000000)

		{
			int c = i + j;
			if (c % 2 == 0 && c < 4000000) {
				sum = sum + c;
			}
			i = j;
			j = c;
		}
		System.out.println(sum);
	}

	static int fibonacci(int k, int m) {
		int val = k + m;
		i = m;
		j = val;
		return val;
	}

}
