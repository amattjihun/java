package ������;

import javax.swing.JOptionPane;

public class �׷��ȿ��� {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("�̸��� �Է�");
		System.out.println(name);
		
		String age = JOptionPane.showInputDialog("���̸� �Է�");
		//�ܺο��� �Է��ؼ� ������ �־��ִ� ����
		//��ǻ�ʹ� ������ Stringó��.(�����ؾ��� ��� String��� int���)
		int age2 = Integer.parseInt(age);
		
		System.out.println(age2 + 1 + "��");

	}

}
