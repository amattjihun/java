package �迭;

import java.util.Scanner;

import javax.swing.JFrame;

public class ��ȭ���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10]; //{0,0,0,...}
		int count = 0;
		final int PRICE = 10000; //�����Ұ�
		
		while (true) {
			System.out.println("=====================");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
			System.out.println("=====================");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("=====================");
			System.out.println("�¼� ��ȣ ����(����� -1): ");
			int no = scan.nextInt();
			if (no == -1) {
				System.out.println("���� �ý��� ����");
				System.out.println("--------------------");
				System.out.println("����� �¼�: " + count + "�ڸ�");
				System.out.println("���� �����ݾ�: " + count * PRICE + "��");
				//break; //while�� ����
				//break�� ��쿡 �������� �ʴ� �ڵ�
				System.exit(0);//��ǻ�Ϳ��� ���α׷� ���� ���
			}
			//no = 1�� ���
			if (seat[no-1] != 1) {
				seat[no-1] = 1;
				count++;
				
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			} else {
				System.out.println("�̹� ����� �¼��Դϴ�.");
				System.out.println("�ٸ� �¼��� ������ �ּ���");
			}
			seat[no-1] = 1;
			System.out.println("���� �Ϸ�");
		}
	}

}
