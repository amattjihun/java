package �迭;

public class �迭���� {

	public static void main(String[] args) {
		int s1;//�����Ÿ�� ������; ram�� ������ �Ҵ�
		//������ �� �ڹٴ� ���� ������ �Ҵ�
		//����� ��ġ�� �� ������ �� �� �ִ� ��������
		
		int s2, s3, s4, s5, s6, s7, s8, s9, s10;
		
		int[] s = new int[10];//3��
		System.out.println(s);
		System.out.println(s[0]);//ù��° ��ġ��
		//��ġ��(index)�� 0���� ����
		s[0] = 100;
		System.out.println(s[0]);
		s[4] = 500;
		//5��°�� 500�� �־ ����Ʈ : ��ġ�� 4
		s[9] = 900;
		//��������°�� 900�� �־ ����Ʈ : ��ġ�� 9
		System.out.println(s[4]);
		System.out.println(s[9]);
		
		
		
		
		
		
		
		
		System.out.println(s.length); //�б�����
		//�迭�� ������ �ڵ����Ǿ� �� �ִ� ����
		
		System.out.println(s[s.length-1]);
		//������ ��ġ��
		
		for (int i = 0; i < s.length; i++) {
			
		}
	}

}
