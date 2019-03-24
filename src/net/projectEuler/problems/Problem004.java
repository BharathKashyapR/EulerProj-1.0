/**
 * 
 */
package net.projectEuler.problems;

/**
 * @author T3726
 *
 */
public class Problem004 {

	/**
	 * @param args
	 */

	// Find the largest palindrome made from the product of two 3-digit numbers.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int largest = 0;
		int l = 0, m = 0;
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				int sum = i * j;
				if (isPalindrome(sum) && sum > largest) {
					largest = sum;
					l = i;
					m = j;
				}
			}
		}
		System.out.println(largest + " No's: " + l + " " + m);
	}

	public static boolean isPalindrome(String s) {
		return s.equals(reverse(s));
	}

	// Tests whether the given integer is a palindrome in decimal (base 10).
	public static boolean isPalindrome(int x) {
		return isPalindrome(Integer.toString(x));
	}

	public static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

}
