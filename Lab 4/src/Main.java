import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getSum(n));

	}
	
	public static int getSum(int n) {
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum+=Math.pow(digit, 3);
			n=n/10;
		}
		return sum;
	}

}
