package Static;

public class Day {
	String doing;
	int time;
	String location;
	
	//static변수
	static int count; //자동으로 0으로 초기화
	static int sum;
	
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		count++;
		sum = sum + time;
	}


	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
	
	
}
