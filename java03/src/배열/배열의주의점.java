package �迭;

public class �迭�������� {

	public static void main(String[] args) {
		//�迭�� �� ���� ������ ����� ������ ���� �̹� �˰� �ִ���
		//�𸣰� �ִ��� üũ�ؾ���.
		//1. ���� �𸣴� ���: ������ �ϴ� �����, ���߿� ���� ����.
		//2. ���� �ƴ� ���: ������ ����鼭, �ٷ� ���� ����
		int[] jumsu = {100, 80, 70, 60, 55};
		jumsu[0] = 90;
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		
		//������ Ű(double), ����(int), �̸�(String, "ȫ�浿")
		//����(char, '��'), ������ �Ծ�����(boolean) ����Ʈ�ϱ�
		double[] high = {186, 160, 178, 165};
		for (int i = 0; i < high.length; i++) {
			System.out.println(high[i]);
		}
		int[] age = {47, 45, 18, 14};
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
			
		}
		String[] name = {"������", "������", "������", "������"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
			
		}
		char[] gen = {'��', '��', '��', '��'};
		for (int i = 0; i < gen.length; i++) {
			System.out.println(gen[i]);
			
		}
		boolean[] food = {true, true, true, false};
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
			
		}
	}

}
