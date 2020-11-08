package 배열고급;

public class 배열문제 {

	public static void main(String[] args) {
		int math = 100;
		int eng = math - 10;
		System.out.println("수학점수 : " + math);
		System.out.println("영어점수 : " + eng);
		
		System.out.println("---------------------");
		
		
		int[] math2 = {100, 99, 88};
		int[] eng2 = math2.clone();
		eng2[1] = 77;
		System.out.print("수학점수 목록 :");
		for (int x : math2) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.print("영어점수 목록 :");
		for (int x : eng2) {
			System.out.print(x + " ");
		}
	}
}
