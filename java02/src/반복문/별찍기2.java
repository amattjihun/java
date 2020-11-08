package 반복문;

import java.util.Scanner;

public class 별찍기2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값 >> ");
		int s = sc.nextInt();
		System.out.print("종료값 >> ");
		int e = sc.nextInt();
		
		int sum = 0;
		
		for (int i = s; i <= e; i++) {
			sum = sum + i;
		}	
		System.out.println("다 더한 값은 " + sum);
		
	}

}
