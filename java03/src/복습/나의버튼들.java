package ����;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.security.PublicKey;
import java.util.Random;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.lang.annotation.Target;
import java.awt.event.ActionEvent;

public class ���ǹ�ư�� {
	private static JTextField text;
	private static int count = 0;

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(99) + 1;//0~98 + 1 �������� ���� ����
		System.out.println("����>> " + target);
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.setTitle("\uC22B\uC790\uB9DE\uCD94\uAE30 \uAC8C\uC784");
		f.setBackground(Color.BLACK);
		f.getContentPane().setForeground(Color.BLACK);
		f.setSize(328,357);
		f.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("\uC22B\uC790\uB97C \uB9DE\uCDB0\uBCF4\uC790!");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;//����������
				//count = count + 1;�� ����
				String data = text.getText();//���ڸ� ������
				int data2 = Integer.parseInt(data);
				text.setText("");
				JOptionPane.showMessageDialog(f, "�Է��� �����ʹ� " + data2);
				
				if (target == data2) { //�񱳿������� ����� true/false
					JOptionPane.showMessageDialog(f, "�����Դϴ�!");
					JOptionPane.showMessageDialog(f, count + "ȸ �õ��߽��ϴ�.");
				} else {
					JOptionPane.showMessageDialog(f, "������ �ƴմϴ�. �ٽ� �õ��ϼ���.");
					if (target < data2) {
						JOptionPane.showMessageDialog(f, "�ʹ� Ů�ϴ�.");
						
					} else {
						JOptionPane.showMessageDialog(f, "�ʹ� �۽��ϴ�.");

					}

				}
				
				
				
				
				
				
			}
		});
		b1.setFont(new Font("����", Font.PLAIN, 15));
		b1.setForeground(Color.BLACK);
		b1.setBackground(Color.BLUE);
		b1.setBounds(31, 212, 241, 60);
		f.getContentPane().add(b1);
		
		JLabel lblNewLabel = new JLabel("\uB2F9\uC2E0\uC774 \uC0DD\uAC01\uD55C \uAE00\uC790\uB97C \uC785\uB825\uD558\uC138\uC694.");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 15));
		lblNewLabel.setBounds(31, 21, 228, 47);
		f.getContentPane().add(lblNewLabel);
		
		text = new JTextField();
		text.setBackground(Color.GREEN);
		text.setForeground(Color.BLACK);
		text.setBounds(31, 105, 228, 47);
		f.getContentPane().add(text);
		text.setColumns(10);
		
		f.setVisible(true);

	}
}
