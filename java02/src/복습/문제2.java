package 복습;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나의 이름은? >> ");
		String name = sc.next();
		
		System.out.print("나의 키는? >> ");
		double high = sc.nextDouble();
		
		System.out.print("나의 몸무게는? >> ");
		double wig = sc.nextDouble();
		
		System.out.print("저녁을 먹었나요? >> ");
		boolean food = sc.nextBoolean();
		
		sc.nextLine();
		//중간에 사용하지 않은 enter인식하는 경우,nextLine()으로 처리
		
		System.out.print("나의 좌우명은? >> ");
		String life = sc.nextLine();
		
		System.out.println("-------------------------");
		System.out.println("내 이름은 " + name);
		System.out.println("내 내년 키는 " + high + 10);
		System.out.println("내 내년 몸무게는 " + (wig - 5));
		System.out.println("나는 저녁을 " + food);
		System.out.println("나의 좌우명은 " + life);
		
	}

}
