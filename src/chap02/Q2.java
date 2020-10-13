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
			System.out.println("a[" + i + "]��(��) a[" + (a.length - i - 1) + "]�� ��ȯ�մϴ�.");
			swap(a, i, a.length -i -1);
			printArray(a);
		}
		
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[6];
		for(int i=0; i<6; i++)
			intArray[i] = scanner.nextInt();
		reversePrint(intArray);
	}
}
