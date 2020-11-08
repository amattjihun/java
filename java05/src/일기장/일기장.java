package 일기장;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 일기장 {

	public static void main(String[] args) {
		//기본틀 부품 필요
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\jjh\\java05\\diary.png"));
		lblNewLabel.setBounds(12, 10, 510, 267);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(22, 287, 40, 47);
		f.getContentPane().add(lblNewLabel_1);
		
		JTextPane id = new JTextPane();
		id.setForeground(Color.CYAN);
		id.setFont(new Font("굴림", Font.PLAIN, 35));
		id.setBounds(74, 286, 366, 48);
		f.getContentPane().add(id);
		
		JLabel lblNewLabel_1_1 = new JLabel("PW");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 40));
		lblNewLabel_1_1.setBounds(0, 344, 62, 47);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JTextPane pw = new JTextPane();
		pw.setForeground(Color.CYAN);
		pw.setFont(new Font("굴림", Font.PLAIN, 35));
		pw.setBounds(74, 344, 366, 48);
		f.getContentPane().add(pw);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//입력한 id/pw가 원래의 id/pw와 일치하는지 체크
				String id2 = id.getText();//id 텍스트 필드에 입력한 값을 가지고 옴
				String pw2 = pw.getText();
				System.out.println("가지고 온 id: " + id2);
				System.out.println("가지고 온 pw: " + pw2);
				String id3 = "root";
				String pw3 = "1234";
				if ( id2.equals(id3) && pw2.equals(pw3) ) {//and연산자: 조건이 모두 true
					JOptionPane.showMessageDialog(f, "로그인 성공");
					일기장실행 d = new 일기장실행();
					d.open();
					
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\jjh\\java05\\login.png"));
		btnNewButton.setBounds(34, 434, 199, 59);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				id.setText("");
				pw.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\jjh\\java05\\reset.png"));
		btnNewButton_1.setBounds(279, 402, 181, 120);
		f.getContentPane().add(btnNewButton_1);
		f.setSize(550,571);
		f.setTitle("로그인 화면");
		//일기장 이미지 넣을 부분 필요
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
}
