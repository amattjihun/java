package 반복문;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class 인기투표 {

	public static void main(String[] args) {
		int 유재석 = 0, 아이유 = 0, 방탄 = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("인기투표 1)유재석, 2)아이유, 3)방탄, 4)종료");
			System.out.println("----------------------------------");
			System.out.print("번호 선택>> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				유재석++;
			} else if (choice == 2) {
				아이유++;
			} else if (choice == 3) {
				방탄++;
			} else if (choice == 4) {
				System.out.println("시스템 종료");
				System.out.println("전체" + (유재석 + 아이유 + 방탄));
				System.out.println("유재석 " + 유재석 + "표");
				System.out.println("아이유 " + 아이유 + "표");
				System.out.println("방탄 " + 방탄 + "표");	
				System.exit(0);
				//종료처리
				//while문 반복 종료
				//break;
				//프로그램 종료
			} else {
					System.out.println("1~4사이의 값을 선택해주세요.");
			}
		}
	}

}
