package ���;

import java.util.Date;

public class �λ��ϱ� {

	public static void main(String[] args) {
		Date date = new Date();
		
		int time = date.getHours();
		System.out.println("���� �ð��� " + time + "�� �Դϴ�.");
		if (time < 10) {
			System.out.println("�¸��");
		}else if (time < 17) {
			System.out.println("�¿����ʹ�");
		}else if (time < 21) {
			System.out.println("���̺��");
		}else {
			System.out.println("�³���");
			
		}
	}

}
