package chap02;

import java.util.Scanner;

public class Q7 {

	static void change(char[] x, int a, int b) {
		char t = x[a];
		x[a] = x[b];
		x[b] = t;
	}

	static int printCardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		System.out.println(r + " |        " + x);
		System.out.println("  +------------");
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
			if (x == 0) {
				System.out.println("          " + x + " ··· " + d[digits - 1]);
			} else {
				System.out.println(r + " |        " + x + " ··· " + d[digits - 1]);
				System.out.println("  +------------");
			}
		} while (x != 0);

		for (int i = 0; i <= digits / 2; i++) {
			change(d, i, digits - i);
		}

		return digits;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int inputNum;
		do {
			System.out.println("10진수를 기수 변환합니다.");
			System.out.print("변환하는 음이 아닌 정수 : ");
			inputNum = scanner.nextInt();
		} while (inputNum < 0);

		int convNum;
		do {
			System.out.print("어떤 진수로 변환할까요?(2-36) : ");
			convNum = scanner.nextInt();
		} while (convNum < 2 || convNum > 36);

		char[] answer = new char[36];
		int digits = printCardConv(inputNum, convNum, answer);
		System.out.print(convNum + "진수로 ");
		for (int i = 0; i <= digits; i++) {
			System.out.print(answer[i]);
		}
		System.out.print("입니다.");
		scanner.close();
	}
}
