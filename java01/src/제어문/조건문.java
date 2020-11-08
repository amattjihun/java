package 제어문;

import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("취미 입력: ");
		String hob = sc.next();
		System.out.print("소속 입력: ");
		String in = sc.next();
		
		System.out.println("당신의 이름은 " + name);
		System.out.println("당신의 취미는 " + hob);
		System.out.println("당신의 소속은 " + in);
	}

}
