package ����;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸���? >> ");
		String name = sc.next();
		
		System.out.print("���� Ű��? >> ");
		double high = sc.nextDouble();
		
		System.out.print("���� �����Դ�? >> ");
		double wig = sc.nextDouble();
		
		System.out.print("������ �Ծ�����? >> ");
		boolean food = sc.nextBoolean();
		
		sc.nextLine();
		//�߰��� ������� ���� enter�ν��ϴ� ���,nextLine()���� ó��
		
		System.out.print("���� �¿����? >> ");
		String life = sc.nextLine();
		
		System.out.println("-------------------------");
		System.out.println("�� �̸��� " + name);
		System.out.println("�� ���� Ű�� " + high + 10);
		System.out.println("�� ���� �����Դ� " + (wig - 5));
		System.out.println("���� ������ " + food);
		System.out.println("���� �¿���� " + life);
		
	}

}
