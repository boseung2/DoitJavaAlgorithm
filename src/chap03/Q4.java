package chap03;

import java.util.Scanner;

public class Q4 {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;

		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key)
				return pc;
			else if (a[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);

		return -1;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = scanner.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = scanner.nextInt();
		}

		// 배열 입력받음

		System.out.print("검색할 값 : ");
		int key = scanner.nextInt();

		// 검색할 값 입력받음

		// *매서드 start
		System.out.println("   |");
		for (int i = 0; i < num; i++)
			System.out.printf("%3d", i);
		System.out.println("---+--------------------");

		int start = 0;
		int finish = num - 1;
		int mid = (start + finish) / 2;
		while(true) {
			System.out.print("   |");
			for(int i=0; i<start; i++) {
				System.out.println("   ");
			}
			System.out.print(" <-");
			
			for(int i=start; i<mid; i++) {
				System.out.println("   ");
			}
			System.out.println(" + ");
			
			for(int i=mid; i<finish; i++) {
				System.out.println("   ");
			}
			System.out.println(" ->");
			
//			do {
//				if (x[mid] == key)
//					return mid;
//				else if (x[mid] < key)
//					start = mid + 1;
//				else
//					start = mid - 1;
//			} while (start <= finish);
//			에라모르겠다
		}
		
		
		
		
		
		
	}
}
