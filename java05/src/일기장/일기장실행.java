package 일기장;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class 일기장실행 {

	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("\uB0A0\uC9DC");
		l1.setFont(new Font("굴림", Font.PLAIN, 40));
		l1.setBounds(229, 10, 92, 47);
		f.getContentPane().add(l1);
		
		JTextPane t1 = new JTextPane();
		t1.setForeground(new Color(0, 0, 0));
		t1.setBackground(Color.WHITE);
		t1.setFont(new Font("굴림", Font.PLAIN, 25));
		t1.setBounds(65, 61, 417, 40);
		f.getContentPane().add(t1);
		
		JTextPane t2 = new JTextPane();
		t2.setFont(new Font("굴림", Font.PLAIN, 25));
		t2.setBounds(65, 160, 417, 40);
		f.getContentPane().add(t2);
		
		JTextPane t3 = new JTextPane();
		t3.setBounds(65, 257, 417, 146);
		f.getContentPane().add(t3);
		
		JLabel l2 = new JLabel("\uC81C\uBAA9");
		l2.setFont(new Font("굴림", Font.PLAIN, 40));
		l2.setBounds(229, 111, 92, 47);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("\uB0B4\uC6A9");
		l3.setFont(new Font("굴림", Font.PLAIN, 40));
		l3.setBounds(229, 210, 92, 55);
		f.getContentPane().add(l3);
		
		JButton b1 = new JButton("New button");
		b1.setIcon(new ImageIcon("D:\\jjh\\java05\\save.png"));
		b1.setBounds(38, 432, 464, 69);
		f.getContentPane().add(b1);
		f.setSize(550,550);
		f.setTitle("일기쓰기");
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1 = t1.getText();//날짜입력 가지고옴
				String data2 = t2.getText();//제목입력 가지고옴
				String data3 = t3.getText();//내용입력 가지고옴
				//~.txt 생성
				try {
					FileWriter file = new FileWriter(data1 + ".txt");
					file.write(data1 + "\n");// \n = 엔터키(enter)
					file.write(data2 + "\n");
					file.write(data3 + "\n");
					file.close();//통로(stream,강물)를 끊음
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
