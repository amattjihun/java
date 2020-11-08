package 반복문;

import java.util.Scanner;

public class 별찍기3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값 >> ");
		int s = sc.nextInt();
		System.out.print("종료값 >> ");
		int e = sc.nextInt();
		
		for (int i = s; i <= e; i++) {
			if (i % 2 == 0) {
				System.out.println("짝수>> " + i);
			}
		}	
		
	}

}
