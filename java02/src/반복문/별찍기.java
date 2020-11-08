package 반복문;

import java.util.Scanner;

public class 별찍기 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복 횟수 입력>> ");
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println("★");
		}
	}

}
