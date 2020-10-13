package chap02;

import java.util.Scanner;

public class Q4 {
	static void copy(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("배열  a의 요솟수 : ");
		int na = scanner.nextInt();
		
		int[] a = new int[na];
		
		for(int i=0; i<na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = scanner.nextInt();
		}
		
		int[] b = new int[a.length];
		copy(a, b);
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
