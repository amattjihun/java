package �迭;

import java.util.Random;

public class ����ü�� {

	public static void main(String[] args) {
		int[] ���� = new int[990];
		int[] ���� = new int[990];
		
		Random r = new Random();
		//���Ѱ�: seed��
		for (int i = 0; i < ����.length; i++) {
			����[i] = r.nextInt(4) + 1;//0~3 => 1~4
		}
		for (int i = 0; i < ����.length; i++) {
			����[i] = r.nextInt(4) + 1;
		}
		int count = 0;
		for (int i = 0; i < ����.length; i++) {
			System.out.println(i + ": " + ����[i] + "<--> " + ����[i]);
			if (����[i] == ����[i]) {
				count++;
			}
		}
		System.out.println("������ " + count + "��");
	}

}
