package ������;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class �⺻�Է�4 {

	public static void main(String[] args) {
		//��� �Է��� Ÿ���� ������ String���� ��ǻ�ʹ� ó���Ѵ�.
		//Scanner�� RAM�� CPU�� ������ �� �ְ� �����ؼ� ����ϴ� ��ǰ.
		
		Scanner sc = new Scanner(System.in);
		//�ѹ� �����ؿ��� �� ��ǰ �ȿ����� �ٽ� ���� �� �ص� ��
		
		System.out.print("����1 �Է� >> ");
		int n11 = sc.nextInt();//String���� int�� �ٲ��ִ� ����(sc.nextInt)
		System.out.print("����2 �Է� >> ");
		int n22 = sc.nextInt();//int <- String
		
		
		System.out.println(n11 + n22); //���������
	}

}
