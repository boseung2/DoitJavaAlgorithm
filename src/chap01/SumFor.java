package chap01;
import java.util.Scanner;

class SumFor {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i=0; i<=n; i++)
			sum += i;
		
		System.out.println("1����  " + n + "������ ���� " + sum + "�Դϴ�.");
	}
}