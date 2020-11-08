package 순차문;

import javax.swing.JOptionPane;

public class 기본입력2 {

	public static void main(String[] args) {
		String id1 = "root";// 설정
		String id2 = JOptionPane.showInputDialog("아이디를 입력하세요.");
		String pass1 = "abc123";// 설정
		String pass2 = JOptionPane.showInputDialog("비밀번호는 입력하세요.");
		//논리연산자: and(&&, 조건이 다 맞아야함), or(||, 조건이 한개 이상 맞아야함), !(not)
		if (pass1.equals(pass2)) { // true
			System.out.println("합격");	
		} else {//false
			//crtl + shift + f : 자동정렬
			System.out.println("불합격");
		}

	}

}
