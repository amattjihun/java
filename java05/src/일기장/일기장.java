package �ϱ���;

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

public class �ϱ��� {

	public static void main(String[] args) {
		//�⺻Ʋ ��ǰ �ʿ�
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\jjh\\java05\\diary.png"));
		lblNewLabel.setBounds(12, 10, 510, 267);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(22, 287, 40, 47);
		f.getContentPane().add(lblNewLabel_1);
		
		JTextPane id = new JTextPane();
		id.setForeground(Color.CYAN);
		id.setFont(new Font("����", Font.PLAIN, 35));
		id.setBounds(74, 286, 366, 48);
		f.getContentPane().add(id);
		
		JLabel lblNewLabel_1_1 = new JLabel("PW");
		lblNewLabel_1_1.setFont(new Font("����", Font.PLAIN, 40));
		lblNewLabel_1_1.setBounds(0, 344, 62, 47);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JTextPane pw = new JTextPane();
		pw.setForeground(Color.CYAN);
		pw.setFont(new Font("����", Font.PLAIN, 35));
		pw.setBounds(74, 344, 366, 48);
		f.getContentPane().add(pw);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�Է��� id/pw�� ������ id/pw�� ��ġ�ϴ��� üũ
				String id2 = id.getText();//id �ؽ�Ʈ �ʵ忡 �Է��� ���� ������ ��
				String pw2 = pw.getText();
				System.out.println("������ �� id: " + id2);
				System.out.println("������ �� pw: " + pw2);
				String id3 = "root";
				String pw3 = "1234";
				if ( id2.equals(id3) && pw2.equals(pw3) ) {//and������: ������ ��� true
					JOptionPane.showMessageDialog(f, "�α��� ����");
					�ϱ������ d = new �ϱ������();
					d.open();
					
				} else {
					JOptionPane.showMessageDialog(f, "�α��� ����");
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
		f.setTitle("�α��� ȭ��");
		//�ϱ��� �̹��� ���� �κ� �ʿ�
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
}
