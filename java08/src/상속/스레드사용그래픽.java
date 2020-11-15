package 상속;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;
import java.awt.Color;

public class 스레드사용그래픽 extends JFrame {
	JLabel c, i, d;// 전역변수 선언 - 글로벌 변수

	public 스레드사용그래픽() {
		getContentPane().setBackground(Color.CYAN);
		setBackground(Color.GREEN);
		setTitle("나의 스레드 프로그래밍");
		setSize(1000, 300);

		c = new JLabel("\uCE74\uC6B4\uD130 \uB4E4\uC5B4\uAC00\uB294 \uBD80\uBD84");
		c.setFont(new Font("굴림", Font.PLAIN, 20));
		getContentPane().add(c, BorderLayout.NORTH);

		i = new JLabel("\uC774\uBBF8\uC9C0 \uB4E4\uC5B4\uAC00\uB294 \uBD80\uBD84");
		i.setFont(new Font("굴림", Font.PLAIN, 20));
		getContentPane().add(i, BorderLayout.EAST);

		d = new JLabel("\uB0A0\uC9DC \uB4E4\uC5B4\uAC00\uB294 \uBD80\uBD84");
		d.setFont(new Font("굴림", Font.PLAIN, 20));
		getContentPane().add(d, BorderLayout.SOUTH);

		Counter2 cc = new Counter2();
		날짜2 dd = new 날짜2();
		이미지2 ii = new 이미지2();
		cc.start();
		dd.start();
		ii.start();

		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		스레드사용그래픽 name = new 스레드사용그래픽();

	}

	// 내부클래스(inner class)
	public class Counter2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 6000; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("CPU와의 문제가 생김");
				}
				c.setText("카운터: " + i);
			}
		}
	}

	public class 날짜2 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 5000; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("CPU와의 문제가 생김");
				}
				Date date = new Date();
				d.setText(date + "");
			}
		}
	}

	public class 이미지2 extends Thread {
		@Override
		public void run() {
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int j = 0; j < 5; j++) {
				try {
					Thread.sleep(3000);// 2초
				} catch (InterruptedException e) {
					System.out.println("CPU와의 문제가 생김");
				}
				ImageIcon icon = new ImageIcon(list[j]);
				i.setIcon(icon);
			}
		}
	}
}
