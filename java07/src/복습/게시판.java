package ����;

public class �Խ��� {
	//����=>����-> ��ü����(�۷ι�����)
	//�ڵ��ʱ�ȭ(int=0), ������->null:�ּҰ� ����.)
	public String title; //���� ��ġ�� �߿�
	public String content;
	public String writer = null;
	
	//����(�������)=>��� �޼���
	public void �۾���() {
		System.out.println("�۾��� ����");
	}
	
	public void �ۻ���() {
		System.out.println("�ۻ��� ����");
	}
	//Ŭ������ �Ȱ��� �̸��� ���� Ŭ������ �ϳ��� ���� ����
	//�ڵ����� �������.
	public �Խ���() {
		
	}
	
	public �Խ���(String t, String c, String w) {
		title = t;
		content = c;
		writer = w;
		
	}
	//���� �־��� ����� ��������(�������̵�)
	public String toString() {
		return "����: " + title + "\n"
				+ "����: " + content + "\n"
				+ "�ۼ���: " + writer;
	}

}
