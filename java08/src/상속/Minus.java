package 상속;

public class Minus extends Thread {
	public void run() {
		for (int i = 100; i >= 0; i--) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(".");
			}
			System.out.println("감소: " + i);
		}
	}
}
