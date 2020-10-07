/**
 *  5	Smallest multiple
 *  
 *  2520 is the smallest number that can be divided by each 
 *  of the numbers from 1 to 10 without any remainder.
	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *  
 *  output:232792560
 * @author kishoremajji
 *
 */
public class Q5 {
	public static void getAns(int n) {
		int num=0;
		for(int i=1;i<Integer.MAX_VALUE;i++) {
			num=n*i;
			int count=0;
			for(int j=n;j>0;j--) {
				if(num%j==0) {
					count++;
				}
			}
			if(count==n) {
				break;
			}
		}
		System.out.println(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getAns(20);
	}

}
