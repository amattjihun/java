package ���;

public class Counter extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 6000; i++) {
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				System.out.println("CPU���� ������ ����");
			}
			System.out.println("ī����: " + i);
		}
	}

}
