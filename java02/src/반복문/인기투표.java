package �ݺ���;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class �α���ǥ {

	public static void main(String[] args) {
		int ���缮 = 0, ������ = 0, ��ź = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("�α���ǥ 1)���缮, 2)������, 3)��ź, 4)����");
			System.out.println("----------------------------------");
			System.out.print("��ȣ ����>> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				���缮++;
			} else if (choice == 2) {
				������++;
			} else if (choice == 3) {
				��ź++;
			} else if (choice == 4) {
				System.out.println("�ý��� ����");
				System.out.println("��ü" + (���缮 + ������ + ��ź));
				System.out.println("���缮 " + ���缮 + "ǥ");
				System.out.println("������ " + ������ + "ǥ");
				System.out.println("��ź " + ��ź + "ǥ");	
				System.exit(0);
				//����ó��
				//while�� �ݺ� ����
				//break;
				//���α׷� ����
			} else {
					System.out.println("1~4������ ���� �������ּ���.");
			}
		}
	}

}
