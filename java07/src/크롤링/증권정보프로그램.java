package 크롤링;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 증권정보프로그램 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(300, 200);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uCE74\uCE74\uC624");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//카카오 크롤링해서 파일로 저장
				네이버접속 증권 = new 네이버접속();
				try {
					증권.open("035720");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton.setBounds(23, 10, 249, 46);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC0BC\uC131\uC804\uC790");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				네이버접속 증권 = new 네이버접속();
				try {
					증권.open("005930");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setBounds(23, 86, 249, 46);
		f.getContentPane().add(btnNewButton_1);
		
		f.setVisible(true);
	}
}
