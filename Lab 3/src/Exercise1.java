import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.nextLine();
		
		String name = sc.nextLine();
		String[] s = name.split(" ");
		
		
		System.out.println(getSecondSmallest(a));
		s=getSorted1(s);
		for(String i:s)
			System.out.print(i+" ");
		System.out.println();
		
		a = getSorted2(a,n);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
		char[] c = {'a','b','c'};
		int[] b = getCount(c);

	}
	
	
	
	//Methods
	public static int getSecondSmallest(int[] a) {
		Arrays.sort(a);
		return a[1];
	}

	public static String[] getSorted1(String[] s) {
		for(int i=0;i<s.length/2;i++) {
			char[] temp = s[i].toCharArray(); 
		    Arrays.sort(temp);
		    String sorted = new String(temp);
		    s[i]=sorted.toLowerCase();
		}
		for(int i=s.length/2;i<s.length;i++) {
			char[] temp = s[i].toCharArray(); 
		    Arrays.sort(temp);
		    String sorted = new String(temp);
		    s[i]=sorted.toUpperCase();
		}
		return s;
	}
	
	public static int[] getSorted2(int[] a,int n) {
		int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        }
		Arrays.sort(b);
		return b;
	}
	
	public static int[] getCount(char[] a) {
		int[] b = new int[255];
		for(char i:a)
			b[i]++;
		return b;
	}
	
}
