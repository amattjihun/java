package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		// 비교 조건이 2개 이상일 때
		// && : and연산자, 모든 조건이 맞을 때 true
		// || : or연산자, 하나이상 조건이 맞을 때 true
		// ! : not연산자, 그 조건이 아닐 때 true
		int id = 1111;
		int id2 = 2222;
		int pw = 2222;
		int pw2 = 3333;
		if (id == id2 && pw == pw2) {//true
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}

}
