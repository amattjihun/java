package �迭;

import java.util.Random;

public class ����������ã�� {

	public static void main(String[] args) {
		int[] s = new int[100000];
		Random r = new Random(42);
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000);//0~999
			
		}
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 999) {
				count++;
				System.out.println(i);
				
			}
		}
		System.out.println("���� " + count);
		
	}

}
