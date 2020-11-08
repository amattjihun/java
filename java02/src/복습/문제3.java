package 복습;

public class 문제3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i <= 10) {
				System.out.print("★");
			}
			System.out.println();
			for (int j = 1; j < 5; j++) {
				System.out.println("커피");
			}
			System.out.println();
			for (int k = 1; k < 3; k++) {
				System.out.println(k + i + "우유");
			}
		}
	}

}
