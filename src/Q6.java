/**
 *  6	Sum square difference
 * @author kishoremajji
 *
 */
public class Q6 {
	public static long getSumOfSquares(long n) {
		int sum=0;
		for(long i=1;i<=n;i++) {
			sum+=i*i;
		}
		return sum;
	}
	public static long getSquareOfSum(long n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum*sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		diference of (sum of squares and suqare of sum)first 100 natural numbers
		
		System.out.println("ans"+(getSquareOfSum(100)-getSumOfSquares(100)));
	}

}
