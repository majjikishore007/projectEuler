/**
 * 5 Smallest multiple
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder. What is the smallest positive number that is
 * evenly divisible by all of the numbers from 1 to 20?
 * 
 * output:232792560
 * 
 * @author kishoremajji
 *
 */
public class Q5 {
	public static void getAns(int n) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int currAns = 1 * 2 / gcd(1, 2);

		for (int i = 2; i < arr.length; i++) {
			currAns = i * currAns / gcd(i, currAns);
		}
		System.out.println(currAns);
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(gcd(1, 2));
	}

}
