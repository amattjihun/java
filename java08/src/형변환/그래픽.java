package 형변환;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 그래픽 extends JFrame {
	
	public 그래픽() {
		setTitle("형변환");
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		
		JButton b1 = new JButton("나를 눌러요");
		JButton b2 = new JButton("나도 눌러요");
		JLabel l = new JLabel("나는 라벨이에요");
		add(b1);//Component(부모) <--- button, label(자식)
		add(b2);
		add(l);
		
		버튼처리클래스 처리 = new 버튼처리클래스();
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 누름");
			}
		});
		//익명클래스
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼2 누름");
			}
		});
		
		setVisible(true);
	}

	public static void main(String[] args) {
		그래픽 name = new 그래픽();
		
		
	}

}
