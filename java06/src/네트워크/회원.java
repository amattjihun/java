package 네트워크;

public class 회원 {
	String id;
	String pw;
	String name;
	String tel;
	
	//입력값이 없는 클래스이름과 동일한 메서드가 자동으로 만들어지게 되어있음.
	public 회원() {
	}
	
	public 회원(String x, String y, String z, String t) {
		id = x;
		pw = y;
		name = z;
		tel = t;
	}
	
	@Override
	public String toString() {
		return id + "\t" + pw + "\t" + name + "\t" + tel;
	}
	
	
	

}
