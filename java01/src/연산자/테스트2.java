package 연산자;

import javax.swing.JOptionPane;

public class 테스트2 {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("숫자1 입력");
		String n2 = JOptionPane.showInputDialog("숫자2 입력");
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		System.out.println("두 수의 합은 " + (n11 + n22) + "입니다.");
		System.out.println("두 수의 차는 " + (n11 - n22) + "입니다.");
		System.out.println("두 수의 곱은 " + (n11 * n22) + "입니다.");
		System.out.println("두 수를 나눈 몫은 " + (n11 / n22) + "입니다.");
		
		JOptionPane.showMessageDialog(null, n11 + n22);
		//null: 없다라는 의미
	}

}
