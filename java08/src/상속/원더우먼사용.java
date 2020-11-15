package 상속;

public class 원더우먼사용 {

	public static void main(String[] args) {
		원더우먼 won = new 원더우먼();
		won.age = 120;
		won.name = "다이애나";
		won.speed = 1500;
		won.eat();
		won.run();
		won.jump();
		System.out.println(won);
	}

}
