/**
 * Q10>Summation of primes
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
 * 
 * 
 * output:142913828922
 * @author kishoremajji007
 *
 */

public class Q10 {
	public static void  getPrimeSum(long n) {
		long sum=0;boolean flag;
		for(long i=2;i<=n;i++) {
			flag=true;
			
			for(long j=2;j<=Math.sqrt(i);j++) {
				
				if(i%j==0) {
					flag=false;
					break;
				}
				
			}
			if(flag) {
			sum+=i;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPrimeSum(2000000);
	}

}
