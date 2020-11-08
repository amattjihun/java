package 연산자;

import javax.swing.JOptionPane;

public class 그래픽연습 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름을 입력");
		System.out.println(name);
		
		String age = JOptionPane.showInputDialog("나이를 입력");
		//외부에서 입력해서 변수에 넣어주는 경우는
		//컴퓨터는 무조건 String처리.(연산해야할 경우 String대신 int사용)
		int age2 = Integer.parseInt(age);
		
		System.out.println(age2 + 1 + "세");

	}

}
