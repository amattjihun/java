package ����;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ���������� {
	public static void main(String[] args) {
		//�ڹٴ� ��ǰ������ ���(��ü ���� ���, OOP)
		//��Ʈ��+�����̽���: �ڵ��ϼ�
		JFrame f = new JFrame();
		JButton b1 = new JButton();
		ImageIcon icon = new ImageIcon("dog.png");
		
		f.setSize(300, 300); //����, ���ΰ�
		b1.setText("������");
		
		f.add(b1);
		b1.setIcon(icon);
		
		
		
		
		
		
		f.setVisible(true); //�׻� ���� ����! �������� ���� ����
	}

}
