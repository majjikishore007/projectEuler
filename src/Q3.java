/**
 * Q3>	Largest prime factor
 * 
 * 	The prime factors of 13195 are 5, 7, 13 and 29.
		What is the largest prime factor of the number 600851475143 ?
 * output:6857
 * @author kishoremajji
 *
 */
public class Q3 {
	public static void getLP(long n) {
		long factor=1;
		while(n>1) {
			factor++;
			if(isPrime(factor)) {
				while(n%factor==0) {
					n=n/factor;
				}
			}
		}
		System.out.println(factor);
	}
	private static boolean isPrime(long factor) {
		for(long i=2;i<Math.sqrt(factor);i++) {
			if(factor%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		getLP(600851475143L);
	}

}
