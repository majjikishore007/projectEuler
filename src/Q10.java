/**
 * Q10>Summation of primes
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all the
 * primes below two million.
 * 
 * 
 * output:142913828922
 * 
 * @author kishoremajji007
 *
 */

public class Q10 {
	
	public static void getPrimeSum(long n) {
		long sum = 2;
		
		for (long i = 3; i < n; i+=2) {
			if(isPrime(i)) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	//this method takes O(N)

	public static boolean isPrime(long i2) {
		
		
		for (int i = 3; i <= Math.sqrt(i2); i += 2) {
			if (i2 % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 2000000
		getPrimeSum(2000000);
		System.out.println(isPrime(2));
	}

}
