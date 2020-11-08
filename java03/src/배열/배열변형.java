package 배열;

public class 배열변형 {

	public static void main(String[] args) {
		int s1;//저장될타입 변수명; ram에 공간이 할당
		//선언할 때 자바는 램에 공간이 할당
		//선언된 위치가 이 변수가 살 수 있는 공간범위
		
		int s2, s3, s4, s5, s6, s7, s8, s9, s10;
		
		int[] s = new int[10];//3층
		System.out.println(s);
		System.out.println(s[0]);//첫번째 위치값
		//위치값(index)는 0부터 시작
		s[0] = 100;
		System.out.println(s[0]);
		s[4] = 500;
		//5번째에 500을 넣어서 프린트 : 위치값 4
		s[9] = 900;
		//마지막번째에 900을 넣어서 프린트 : 위치값 9
		System.out.println(s[4]);
		System.out.println(s[9]);
		
		
		
		
		
		
		
		
		System.out.println(s.length); //읽기전용
		//배열의 개수가 자동계산되어 들어가 있는 변수
		
		System.out.println(s[s.length-1]);
		//마지막 위치값
		
		for (int i = 0; i < s.length; i++) {
			
		}
	}

}
