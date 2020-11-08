package 제어문;

import javax.swing.JOptionPane;

public class 문제1 {

	public static void main(String[] args) {
		String data = JOptionPane.showInputDialog("당신이 먹고 싶은 음식은? 1)짜장  2)우동  3)라면");
		
		switch (data) {
		case "1":
			System.out.println("중국집으로!");
			break;
		case "2":
			System.out.println("일식집으로!");
			break;
		case "3":
			System.out.println("분식집으로!");
			break;
		default:
			System.out.println("집에서 먹어요!");
			break;
		}

	}

}
