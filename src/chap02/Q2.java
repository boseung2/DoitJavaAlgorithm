package chap02;

import java.util.Scanner;

public class Q2 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void printArray(int[] a) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	static void reversePrint(int[] a) {
		
		for(int i=0; i<(a.length / 2); i++) {
			System.out.println("a[" + i + "]과(와) a[" + (a.length - i - 1) + "]를 교환합니다.");
			swap(a, i, a.length -i -1);
			printArray(a);
		}
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[6];
		for(int i=0; i<6; i++)
			intArray[i] = scanner.nextInt();
		reversePrint(intArray);
	}
}
