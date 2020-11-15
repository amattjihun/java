package 크롤링;

import java.util.ArrayList;

import Static.직원;

public class 여러개묶을때 {

	public static void main(String[] args) {
		//배열은 같은 타입만, 사이즈가 정해져 있음.
		//사이즈 조절 불가
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(11,22);
		list.add(true);
		직원 w = new 직원("강길동", "남", 100);
		list.add(w);
		System.out.println(list.size());
		System.out.println(list);
	}

}
