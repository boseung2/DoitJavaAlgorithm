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
	
	
}
