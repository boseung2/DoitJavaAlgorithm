package chap01;

public class Q17 {
	static void snpira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i); j++)
				System.out.print(" ");
			for(int k=1; k<=((i-1)*2 +1); k++)
				System.out.print(i%10);
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		snpira(15);
	}
}
