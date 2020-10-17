package chap02;

public class Q6 {
	static void change(char[] x, int a, int b) {
		char t = x[a];
		x[a] = x[b];
		x[b] = t;
	}

	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) {
			change(d, i, digits - i);
		}

		return digits;
	}

	public static void main(String[] args) {
		char[] d = new char[32];
		cardConv(59, 2, d);
		for(int i=0; i<d.length; i++) {
			System.out.print(d[i]);
		}
	}
}
