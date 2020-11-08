package 그래픽;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class 나의그래픽2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uB20C\uB7EC\uC694!");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(78, 93, 350, 118);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB20C\uB7EC\uC694!");
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(24, 250, 200, 136);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uB20C\uB7EC\uC694!");
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setBounds(264, 250, 208, 136);
		f.getContentPane().add(btnNewButton_2);
		
		f.setVisible(true);
	}
}
