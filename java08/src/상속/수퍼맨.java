package 상속;

public class 수퍼맨 extends 남자{ 
	//멤버변수: name, age, speed
	//멤버메서드: eat(), run()
	
	public void fly() {
		eat();//해당 클래스 내에 있는 메서드는 호출해서 바로 사용 가능
		System.out.println(name + "가 하늘을 날다.");
		
	}
	@Override //오버라이드, 재정의
	public void run() {
	System.out.println("하늘을 날면서 아주 빨리 뛰다.");
	}

	@Override
	public String toString() {
		return "수퍼맨 [speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
