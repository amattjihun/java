package ���;

import java.util.Date;

public class ��¥ extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("CPU���� ������ ����");
			}
			Date date = new Date();
			System.out.println(date);
		}
	}
}
