package chap01;
import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int num;
		do{System.out.print("���� ���� : ");
		num = stdIn.nextInt();
		}while(num <= 0);
		
		int i=0;
		while(num > 0) {
			num /= 10;
			i++;
		}
		System.out.println("�� ���� " + i + "�ڸ��Դϴ�.");
			
	}
}
