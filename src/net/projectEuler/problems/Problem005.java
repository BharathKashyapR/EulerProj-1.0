/**
 * 
 */
package net.projectEuler.problems;

/**
 * @author T3726
 *
 */
public class Problem005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long n = 20;
		System.out.println(lcm(n));

	}

	static long lcm(long n) {
		long ans = 1;
		for (long i = 1; i <= n; i++) {
			ans = (ans * i) / (gcd(ans, i));
		}
		return ans;

	}

	static long gcd(long a, long b) {
		if (a % b == 0)
			return b;
		else
			return gcd(b, a % b);
	}

}
