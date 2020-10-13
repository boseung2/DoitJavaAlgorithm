package chap01;

public class Q15 {
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++)
				System.out.print(" ");
			for(int k=i-1; k<=n; k++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i); j++)
				System.out.print(" ");
			for(int k=(n-i); k<=n-1; k++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	//RU,RB구할때 for문안에 k=1부터 로 바꾸어야 훨나음
	public static void main(String[] args) {
		triangleLB(5);
		triangleLU(5);
		triangleRU(5);
		triangleRB(10);
	}
}
