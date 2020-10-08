/**
 * 6 Sum square difference
 * 
 * The sum of the squares of the first ten natural numbers is, The square of the
 * sum of the first ten natural numbers is, Hence the difference between the sum
 * of the squares of the first ten natural numbers and the square of the sum is
 * . Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * 
 * output:25164150
 * 
 * @author kishoremajji
 *
 */
public class Q6 {
	public static long getSumOfSquares(long n) {

		return n * (n + 1) / 2;
	}

	public static long getSquareOfSum(long n) {

		long ans = n * (n + 1) / 2;
		return ans * ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((getSquareOfSum(100) - getSumOfSquares(100)));

	}

}
