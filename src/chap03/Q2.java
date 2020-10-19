package chap03;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("요소수를 입력해 주세요 : ");
		int num = scanner.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = scanner.nextInt();
		}
		
		System.out.println("찾으시는 수를 입력해주세요 : ");
		int key = scanner.nextInt();
		
		System.out.print("   |  ");
		for(int a=0; a<num; a++) 
			System.out.print(a + "  ");
		System.out.println();
		System.out.println("---+---------------------------");
		
		
		
		int i=0;
		while(true){
			System.out.print("   |  ");
			for(int j=0; j<i; j++)
				System.out.print("   ");
			System.out.println("*");
			
			System.out.printf("  %d|",i);
			for(int k=0; k<num; k++)
				System.out.printf("  %d",x[k]);
			
			if(x[i] == key) {
				System.out.println();
				System.out.println(key + "은(는) x[" + i + "]에 있습니다.");
				break;
			}
			if(i == num-1) {
				System.out.println();
				System.out.println("해당 수가 없습니다.");
				break;
			}
			
			System.out.println();
			System.out.println("   |");
			i++;
		}
		
		scanner.close();
		
	}
}
