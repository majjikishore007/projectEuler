/**
 * 
 * @author kishoremajji007
 *Special Pythagorean triplet
 */
public class Q9 {
	public static void getPythagoreantriplet(long n) {
		for (long a = 3; a <= n; a++) {
            for (long b = a + 1; b < n; b++) {
                
                double cS =  (Math.pow(a, 2) + Math.pow(b, 2));
                double c = Math.pow(cS, 0.5);
                
                if (a + b + c == n) {
                    System.out.println(a * b * c);
                    break;
                }
            }
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getPythagoreantriplet(1000);
		for (int a = 3; a <= 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                
                double cSquared = Math.pow(a, 2) + Math.pow(b, 2);
                double c = Math.pow(cSquared, 0.5);
                
                if (a + b + c == 1000) {
                	System.out.println(a+" "+b+" "+c);
                	double ans=a*b*c;
                	System.out.println(ans);
                    break;
                }
            }
        }
	}

}
