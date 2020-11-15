package 상속;

import java.util.Date;

public class 날짜 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("CPU와의 문제가 생김");
			}
			Date date = new Date();
			System.out.println(date);
		}
	}
}
