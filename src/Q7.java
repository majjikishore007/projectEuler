/**
 * Q7>10001st prime
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	What is the 10 001st prime number?
 * 
 * output:104743
 * @author kishoremajji007
 *
 */
public class Q7 {
	private static boolean isPrime(int j) {
		if(j<2) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(j);i++) {
			if(j%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void get(int n) {
		int max=0;
		int count=0,i=1;
		while(true) {
			i++;
			if(isPrime(i)) {
				count++;
				
				if(i>max) {
					max=i;
				}
			}
			if(count==n) {
				break;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		
		get(10001);
			

	}

	

}
