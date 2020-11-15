package 생성자;

import 복습.우주선;

public class 우주선사용 {

	public static void main(String[] args) {
		//s1이 프로그래머가 원한 부품(대상): object(객체)
		//new를 가지고 클래스의 객체를 만든다.(생성)
		//new => 객체 생성하는 키워드
		//멤버변수들이 복사됨.
		//클래스 이름과 똑같은 메서드: 객체생성시 자동호출 => 생성자 메서드(constructor)
		//객체 생성시 멤버 초기화
		//자동 import: 컨트롤+쉬프트+o
		우주선 s1 = new 우주선(100, 100, "space.img");
		System.out.println(s1);
		
		우주선 s2 = new 우주선(200, 200, "space.img");
		System.out.println(s2);
	}

}
