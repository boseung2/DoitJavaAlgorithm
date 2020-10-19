package chap03;

public class Q3 {

	static int searchIdx(int[] a, int n, int key, int[] idx) {
		
		int i=0;
		while(i<n) {
			int j=0;
			if(a[i] == key) {
				idx[j] = a[i];
				j++;
			}else
				i++;
		}
		return idx.length;
	}
	
	public static void main(String[] args) {
		int[] x = {1, 2, 3, 4, 1, 2, 3, 4};
		int n = 8;
		int key = 2;
		int[] idx = new int[5];
		
		searchIdx(x, n, key, idx);
		System.out.println(idx[0]);
	}

}
