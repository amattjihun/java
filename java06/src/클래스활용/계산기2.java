package 클래스활용;

public class 계산기2 {
	public void add(int x, int y) {
		//입력값이 들어가는 위치에 만들어지는 x,y:
		//매개변수(parameter, 파라메터)
		System.out.println(x + y + "=> 더하다.");
	}
	public void minus(int x, int y, int z) {
		System.out.println(x - y - z + "=> 빼다.");
	}
	//public: 아무데서나 접근 가능
	//int: 변환(return)되는 데이터의 타입
	//mul:(입력값을 넣을 수 있는 변수들)
	public int mul(int x, int y) {
		//void: 없다, 리턴이 없다, 넘겨줄 값이 없다.
		int result = x * y;
		System.out.println(result + "=>곱하다.");
		return result;
	}
}
