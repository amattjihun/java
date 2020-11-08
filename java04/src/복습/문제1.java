package 복습;

import javax.swing.JOptionPane;

public class 문제1 {

	public static void main(String[] args) {
		String[] subject = new String[3];
		//{null, null, null)
		
		for (int i = 0; i < subject.length; i++) {
			subject[i] = JOptionPane.showInputDialog("과목을 입력하세요");
		}
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " ");
		}
	}

}
