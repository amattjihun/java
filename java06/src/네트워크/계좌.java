package ��Ʈ��ũ;

public class ���� {
	//��������
	String name;
	String field;
	int price;
	
	public void �Ա�() {
		System.out.println(name + " ���� " + price + "�� �Ա�");
	}
	public void ���() {
		System.out.println(name + " ���� " + price + "�� ���");
	}
	@Override//������
	public String toString() {
		return "���� �̸� = " + name + ", ���� = " + field + ", �ݾ� = " + price + "]";
	}
	
	//���� �ִ� �޼��带 �Ȱ��� �ٽ� ���ָ�
	//�ٽ� ���� �޼��尡 ����=> ������(override, �������̵�)
//	public String toString() { 
//		return name + ", " + field + ", " + price;
//	}
	
	
	

}
