package 그래픽;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		for (int i = 0; i < 50; i++) {
			JButton b1 = new JButton();
			b1.setText(i + "번 나를 눌러요");
			f.add(b1);
		}
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.setVisible(true);
	}

}
