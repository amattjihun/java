package 클래스;

public class 부품사용 {

	public static void main(String[] args) {
		bag Bag = new bag();
		Bag.id = "root";
		Bag.name = "홍길동";
		Bag.move();
		System.out.println(Bag.id);
		System.out.println(Bag.name);
		
	}

}
