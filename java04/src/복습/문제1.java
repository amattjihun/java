package ����;

import javax.swing.JOptionPane;

public class ����1 {

	public static void main(String[] args) {
		String[] subject = new String[3];
		//{null, null, null)
		
		for (int i = 0; i < subject.length; i++) {
			subject[i] = JOptionPane.showInputDialog("������ �Է��ϼ���");
		}
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " ");
		}
	}

}
