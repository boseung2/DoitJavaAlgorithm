package chap02;

public class Q5 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		
	}
	
	static void rcopy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++)
			a[i] = b[b.length-i-1];
	}
	
	public static void main(String[] args) {
		int[] b = {1, 2, 3, 4, 5};
		int[] a = new int[b.length];
		rcopy(a, b);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
	}
}
