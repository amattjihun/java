package ���;

public class Plus extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(".");
			}
			System.out.println("����: " + i);
		}
		
	}
}
