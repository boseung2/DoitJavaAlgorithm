package chap02;

import java.util.Scanner;

public class Q9 {

	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		while (--m != 0)
			d += mdays[isLeap(y)][m - 1];
		return (d);
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		if(isLeap(y) == 1)
			return 366-dayOfYear(y, m, d);
		else
			return 365-dayOfYear(y, m, d);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 남은 일수를 구합니다.");
		
		do {
			System.out.print("년 : ");
			int year = scanner.nextInt();
			System.out.print("월 : ");
			int month = scanner.nextInt();
			System.out.print("일 : ");
			int day = scanner.nextInt();
			
			System.out.printf("그 해는 %d일 남았습니다.\n", leftDayOfYear(year, month, day));
			retry = scanner.nextInt();
		}while(retry ==1);
		
		scanner.close();
	}
}
