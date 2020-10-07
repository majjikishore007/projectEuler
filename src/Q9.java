/**Que Special Pythagorean triplet
 * output 31875000
 * @author kishoremajji007 
 */
public class Q9 {
	public static long getPythagoreantriplet(long n) {
		long ans=0;
		for (long a = 3; a <= n; a++) {
			for (long b = a + 1; b < n; b++) {

				double cS = (Math.pow(a, 2) + Math.pow(b, 2));
				double c = Math.pow(cS, 0.5);

				if (a + b + c == n) {
					
				 ans=(long) (a*b*c);
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPythagoreantriplet(1000));
	}

}
