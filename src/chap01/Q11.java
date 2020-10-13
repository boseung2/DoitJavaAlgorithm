package chap01;
import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int num;
		do{System.out.print("양의 정수 : ");
		num = stdIn.nextInt();
		}while(num <= 0);
		
		int i=0;
		while(num > 0) {
			num /= 10;
			i++;
		}
		System.out.println("그 수는 " + i + "자리입니다.");
			
	}
}
