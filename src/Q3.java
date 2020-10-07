/**
 * 3>	Largest prime factor
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
		System.out.println(factor+" factor ");
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
