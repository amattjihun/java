package Static;

public class 미사일 {
	
	//객체 생성시 자동으로 복사되는 변수들(dynamic성격)
	//실제값 들어가는 변수 (instance)
	String name;
	int move;
	static int count; //정적(static) 변수
	
	public 미사일(String name, int move) {
		this.name = name;
		this.move = move;
		count++;
	}
	
	public String toString() {
		return "미사일 [name=" + name + ", move=" + move + "]";
	}
	
	
	
	
}
