package �迭���;

import java.util.Random;

public class ��������ã��2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] n = new int[1000];
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt();//0~999
		}
		int max = n[0]; //33
		for (int i = 1; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			}
		}
		System.out.println(max);
		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if(max == n[i]); {
				count++;
				System.out.println("�ִ밪�� ��ġ : " + i);
			}
		}
		System.out.println("�ִ밪�� ���� : " + r);
	}

}
