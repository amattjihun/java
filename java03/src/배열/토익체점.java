package 배열;

import java.util.Random;

public class 토익체점 {

	public static void main(String[] args) {
		int[] 정답 = new int[990];
		int[] 내답 = new int[990];
		
		Random r = new Random();
		//씨앗값: seed값
		for (int i = 0; i < 정답.length; i++) {
			정답[i] = r.nextInt(4) + 1;//0~3 => 1~4
		}
		for (int i = 0; i < 내답.length; i++) {
			내답[i] = r.nextInt(4) + 1;
		}
		int count = 0;
		for (int i = 0; i < 정답.length; i++) {
			System.out.println(i + ": " + 정답[i] + "<--> " + 내답[i]);
			if (정답[i] == 내답[i]) {
				count++;
			}
		}
		System.out.println("점수는 " + count + "점");
	}

}
