package ���;

import java.util.Date;

public class �̹��� extends Thread {
	@Override
	public void run() {
		String[] list =  {"1.png", "2.png", "3.png", "4.png", "5.png"};
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(3000);//2��
			} catch (InterruptedException e) {
				System.out.println("CPU���� ������ ����");
			}
			System.out.println(list[i]);
		}
	}
}
