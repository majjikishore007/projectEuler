/**
 * Q7>10001st prime
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13. What is the 10001st prime number?
 * 
 * output:104743
 * 
 * @author kishoremajji007
 *
 */
public class Q7 {
	private static boolean isPrime(int i2) {

		for (int i = 3; i <= Math.sqrt(i2); i += 2) {
			if (i2 % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void get(int n) {

		int count = 1, i = 3;
		while (true) {

			if (isPrime(i)) {
				count++;
			}
			if (count == n) {
				break;
			}
			i += 2;
		}
		System.out.println(i);
	}

	public static void main(String[] args) {

		get(10001);

	}

}
