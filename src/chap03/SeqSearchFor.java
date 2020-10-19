package chap03;

import java.util.Scanner;

public class SeqSearchFor {
	static int seqSearch(int[] a, int n, int key) {
		for(int i=0; i<n; i++)
			if(a[i] == key)
				return i;
		return -1;
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = scanner.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = scanner.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = scanner.nextInt();
		int idx = seqSearch(x, num, key);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key+"은(는) x[" + idx + "]에 있습니다.");
		scanner.close();
	}
}
