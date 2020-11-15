package 상속;

import java.util.Date;

public class 이미지 extends Thread {
	@Override
	public void run() {
		String[] list =  {"1.png", "2.png", "3.png", "4.png", "5.png"};
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(3000);//2초
			} catch (InterruptedException e) {
				System.out.println("CPU와의 문제가 생김");
			}
			System.out.println(list[i]);
		}
	}
}
