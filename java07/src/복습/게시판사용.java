package ����;

public class �Խ��ǻ�� {

	public static void main(String[] args) {
		
		�Խ��� b3 = new �Խ���("������", "�б���", "ȫ�浿3");
		System.out.println(b3);
		
		�Խ��� b1 = new �Խ���();
		//��������� �� ��ü���� �޸𸮰� ���� �������.
		b1.title = "�����";
		b1.content = "����� ����";
		b1.writer = "ȫ�浿";
		//����޼���� ��ü�� ��������� ����, �� ��ü�� ������ ���������� �ִ� ��ǰ�� ȣ���ؼ� �� �� ����.
		b1.�۾���();
		
		System.out.println(b1);
		
		
		�Խ��� b2 = new �Խ���();
		b2.title = "�Ͽ���";
		b2.content = "�Ͽ��� ����";
		b2.writer = "ȫ�浿2";
		b2.�۾���();
	}

}
