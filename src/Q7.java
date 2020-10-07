/*
 * 7	10001st prime
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
		System.out.println(max+" max");
	}
	public static void main(String[] args) {
		
		get(10001);
			

	}

	

}
