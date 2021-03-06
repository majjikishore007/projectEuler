/**
 * 4>	Largest palindrome product
 * 
 * A palindromic number reads the same both ways.
 *  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 � 99.
	Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * 
 * output:906609
 * @author kishoremajji
 *
 */
 
public class Q4 {
	public static long getAns() {
	
		long max=999;
		long finalAns=0;
		for(long i=max;i>0;i--) {
			for(long j=max;j>0;j--) {
				long ans=j*i;
				if(ans==reverse(ans)) {
					if(ans>finalAns) {
						finalAns=ans;
					}
				}
			}
		}
		return finalAns;
	}
	public static long reverse(long n) {
        long reverse = 0;
        while (n != 0) {
            long r = n % 10;
            reverse = reverse * 10 + r;
            n /= 10;
        }
        return reverse;
    }
	public static void main(String[] args) {
	  System.out.println(getAns());

	}

}
