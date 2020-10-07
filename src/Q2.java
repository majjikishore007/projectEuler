/**
 * 2	Even Fibonacci numbers
 * @author kishoremajji
 *
 */


public class Q2 {
	public static void getEvenFibonaci(long n) {
		long sum = 0;
		int a = 0;
		int b = 1;
		int c = a + b;
		while (c < n) {

			if (c % 2 == 0) {

				sum = sum + c;

			}
			c = a + b;
			a = b;
			b = c;
		}
		System.out.println(sum + "sum ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getEvenFibonaci(4000000);
	}

}
