package 배열;

import java.util.Scanner;

import javax.swing.JFrame;

public class 영화예매 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10]; //{0,0,0,...}
		int count = 0;
		final int PRICE = 10000; //수정불가
		
		while (true) {
			System.out.println("=====================");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			System.out.println("=====================");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("=====================");
			System.out.println("좌석 번호 선택(종료는 -1): ");
			int no = scan.nextInt();
			if (no == -1) {
				System.out.println("예약 시스템 종료");
				System.out.println("--------------------");
				System.out.println("예약된 좌석: " + count + "자리");
				System.out.println("예약 결제금액: " + count * PRICE + "원");
				//break; //while문 종료
				//break걸 경우에 실행하지 않는 코드
				System.exit(0);//컴퓨터에게 프로그램 종료 명령
			}
			//no = 1인 경우
			if (seat[no-1] != 1) {
				seat[no-1] = 1;
				count++;
				
				System.out.println("예약이 완료되었습니다.");
			} else {
				System.out.println("이미 예약된 좌석입니다.");
				System.out.println("다른 좌석을 선택해 주세요");
			}
			seat[no-1] = 1;
			System.out.println("예매 완료");
		}
	}

}
