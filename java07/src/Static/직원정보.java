package Static;

public class 직원정보 {

	public static void main(String[] args) {
		직원 a1 = new 직원("홍길동", "남", 25);
		직원 a2 = new 직원("김길동", "여", 22);
		직원 a3 = new 직원("송길동", "남", 24);
		System.out.println("전체 직원수: " + 직원.count + "명");
		System.out.println("평균나이: " + 직원.getAvg() + "세");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}

}
