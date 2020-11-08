package 배열;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범만들기 {
	static int count = 2;

	public static void main(String[] args) {
		String[] title = {"삼진그룹 영어토익반", "담보", "위플래쉬" ,"미스터트롯: 더 무비" ,"소리도 없이"};
		String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
		double[] jumsu = {9.27, 9.18, 8.87, 8.94, 7.89};
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.setSize(500,500);
		
		JLabel top = new JLabel(title[2]);
		top.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		f.getContentPane().add(center, BorderLayout.CENTER);
		ImageIcon icon = new ImageIcon(list[2]);
		center.setIcon(icon);
		
		JLabel sub = new JLabel(jumsu[2] + "점");
		sub.setFont(new Font("굴림", Font.PLAIN, 15));
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (count > 0) {
					count--;//1<-2
					top.setText(title[count]);	
					sub.setText(jumsu[count] + "점");
					ImageIcon icon = new ImageIcon(list[count]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "왼쪽 마지막 페이지입니다.");
				}
				
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < 4) {
					count++;//2->3
					top.setText(title[count]);
					sub.setText(jumsu[count] + "점");
					ImageIcon icon = new ImageIcon(list[count]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "오른쪽 마지막 페이지입니다.");
				}
				
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//맨 끝에 있어야한다.
		f.setVisible(true);
	}

}
