package ������;

import javax.swing.JOptionPane;

public class �⺻�Է�2 {

	public static void main(String[] args) {
		String id1 = "root";// ����
		String id2 = JOptionPane.showInputDialog("���̵� �Է��ϼ���.");
		String pass1 = "abc123";// ����
		String pass2 = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���.");
		//��������: and(&&, ������ �� �¾ƾ���), or(||, ������ �Ѱ� �̻� �¾ƾ���), !(not)
		if (pass1.equals(pass2)) { // true
			System.out.println("�հ�");	
		} else {//false
			//crtl + shift + f : �ڵ�����
			System.out.println("���հ�");
		}

	}

}
