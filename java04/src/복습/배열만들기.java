package ����;

public class �迭����� {

	public static void main(String[] args) {
		//�迭�� ���� �� ������ �̹� �˰� �ִ� ���
		int[] s = {100, 90, 80, 70};
		//�б� ���� ���� length => �迭������ ����: 4
		//�迭�� ��ġ�� ������ ������ �����ų� ����
		//��ġ��(index)�� 0���� ����
		s[0] = 99;
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		//foreach: �ϳ���
		for (int x : s) {
			System.out.println(x);
			
		}
		
		//�迭�� ���� �� ������ �𸣰� �ִ� ���
		int[] s2 = new int[4];
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}

	}

}
