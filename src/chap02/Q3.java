package chap02;

public class Q3 {
	static int sumOf(int[] a) {
		int sum = 0;
		
		for(int i=0; i<a.length; i++)
		sum = sum + a[i];
		return sum;
	}
	
	public static void main(String[] args) {
		int[] example = {1, 2, 3, 4, 5, 6, };
		System.out.println(sumOf(example));
	}
}
