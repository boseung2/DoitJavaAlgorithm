package chap01;

import java.util.Scanner;

public class Q14 {
	static void printSquare(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�簢���� ����մϴ�.");
		System.out.print("�� �� : ");
		int n = scanner.nextInt();
		printSquare(n);
		}
}
