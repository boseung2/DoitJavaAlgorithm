package chap01;
import java.util.Scanner;

class Q10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		int b;
		while(true) {
			System.out.print("b�� �� : ");
			b = stdIn.nextInt();
			if(b > a) break;
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}
		System.out.println("b-a�� " + (b-a) + "�Դϴ�.");
		
	}
}