/**
 *  6	Sum square difference
 *  
 *  The sum of the squares of the first ten natural numbers is,
	The square of the sum of the first ten natural numbers is,
	Hence the difference between the sum of the squares of the first ten natural numbers and
 	the square of the sum is .
	Find the difference between the sum of the squares of the first one hundred natural
 	numbers and the square of the sum.
 *  
 *  
 *  output:25164150
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
		
		System.out.println((getSquareOfSum(100)-getSumOfSquares(100)));
	}

}
