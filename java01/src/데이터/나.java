package 데이터;

public class 나 {

	public static void main(String[] args) {
		int age = 18;
		
		char gender = '남';
		
		double eye = 1.5;
		
		boolean food = true;
		//타입 변수명; //렘에 공간이 할당
		//자바는 선언할 때 공간이 만들어진다.
		String name = "정지훈";
		//스트링(실): 정--지--훈
		
		food = false;
		
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 나이는 " + age + "살 입니다.");
		System.out.println("나는 " + gender + "입니다.");
		System.out.println("내 시력은 " + eye + "입니다.");
		System.out.println("나는 점심을 먹었나?" + food);


	}

}
