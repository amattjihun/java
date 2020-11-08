package 순차문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 기본입력4 {

	public static void main(String[] args) {
		//모든 입력의 타입은 무조건 String으로 컴퓨터는 처리한다.
		//Scanner는 RAM에 CPU가 꺼내쓸 수 있게 복사해서 사용하는 부품.
		
		Scanner sc = new Scanner(System.in);
		//한번 복사해오면 이 부품 안에서는 다시 복사 안 해도 됨
		
		System.out.print("숫자1 입력 >> ");
		int n11 = sc.nextInt();//String에서 int로 바꿔주는 역할(sc.nextInt)
		System.out.print("숫자2 입력 >> ");
		int n22 = sc.nextInt();//int <- String
		
		
		System.out.println(n11 + n22); //산술연산자
	}

}
