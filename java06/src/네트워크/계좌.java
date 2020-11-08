package 네트워크;

public class 계좌 {
	//전역변수
	String name;
	String field;
	int price;
	
	public void 입금() {
		System.out.println(name + " 님이 " + price + "원 입금");
	}
	public void 출금() {
		System.out.println(name + " 님이 " + price + "원 출금");
	}
	@Override//재정의
	public String toString() {
		return "계좌 이름 = " + name + ", 종류 = " + field + ", 금액 = " + price + "]";
	}
	
	//원래 있던 메서드를 똑같이 다시 써주면
	//다시 써준 메서드가 실행=> 재정의(override, 오버라이드)
//	public String toString() { 
//		return name + ", " + field + ", " + price;
//	}
	
	
	

}
