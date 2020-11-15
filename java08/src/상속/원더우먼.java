package 상속;

public class 원더우먼 extends 여자{
	public void jump() {
		System.out.println(name + "가 높게 점프하다.");
		
	}

	@Override
	public String toString() {
		return "원더우먼 [speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}
	

}
