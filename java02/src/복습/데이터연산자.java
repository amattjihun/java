package ����;

public class �����Ϳ����� {

	public static void main(String[] args) {
		// �⺻������: ����, �Ǽ�, ����, ��
		double �µ� = 25.5;
		float ������ = 99.9F; //F: �Ҽ��� 4��°�ڸ����� �Է°���(��ҹ��� ���X)
		
		byte age = 100; //-128~127
		short distance = 20000; //+-3��
		int high = 100; //+-21��
		long space = 2211111111L; //L: int�� �ƴ� long�� ���ٴ� ǥ��(��ҹ��� ���X)
		
		char gender = '��'; //�ѱ��ڸ�
		
		boolean cheak = true; //false
		
		System.out.println(age + distance);
		System.out.println(age == distance);
		System.out.println(age != distance);
		
		int sum = high + 1;//101
		//int�� int����� ������ int
		int count = 5;
		//�ϳ��� double�̸� ����� ����� ������ double
		System.out.println(sum / (double)count);
		//���� Ÿ�Ժ�ȯ: (��ȯ�ϰ��� �ϴ� Ÿ��)������
		//ĳ���� casting
	}

}
