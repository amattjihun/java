package �迭���;

public class �迭���� {

	public static void main(String[] args) {
		int math = 100;
		int eng = math - 10;
		System.out.println("�������� : " + math);
		System.out.println("�������� : " + eng);
		
		System.out.println("---------------------");
		
		
		int[] math2 = {100, 99, 88};
		int[] eng2 = math2.clone();
		eng2[1] = 77;
		System.out.print("�������� ��� :");
		for (int x : math2) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.print("�������� ��� :");
		for (int x : eng2) {
			System.out.print(x + " ");
		}
	}
}
