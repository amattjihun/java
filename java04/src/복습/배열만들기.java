package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		//배열을 만들 떄 값들을 이미 알고 있는 경우
		int[] s = {100, 90, 80, 70};
		//읽기 전용 변수 length => 배열값들의 개수: 4
		//배열은 위치를 가지고 값들을 꺼내거나 넣음
		//위치값(index)은 0부터 시작
		s[0] = 99;
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		//foreach: 하나씩
		for (int x : s) {
			System.out.println(x);
			
		}
		
		//배열을 만들 때 값들을 모르고 있는 경우
		int[] s2 = new int[4];
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}

	}

}
