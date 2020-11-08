package 복습;

import java.util.Scanner;

public class 배열활용하기 {

	public static void main(String[] args) {
		int[] s = new int[5]; //{0,0,0,0,0}
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			System.out.print("숫자 입력: ");
			s[i] = scan.nextInt();//"100"
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

}
