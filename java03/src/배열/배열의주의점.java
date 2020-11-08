package 배열;

public class 배열의주의점 {

	public static void main(String[] args) {
		//배열을 쓸 때는 공간을 만드는 순간에 값을 이미 알고 있는지
		//모르고 있는지 체크해야함.
		//1. 값을 모르는 경우: 공간을 일단 만들고, 나중에 값을 넣음.
		//2. 값을 아는 경우: 공간을 만들면서, 바로 값을 넣음
		int[] jumsu = {100, 80, 70, 60, 55};
		jumsu[0] = 90;
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
		
		//가족의 키(double), 나이(int), 이름(String, "홍길동")
		//성별(char, '남'), 저녁을 먹었는지(boolean) 프린트하기
		double[] high = {186, 160, 178, 165};
		for (int i = 0; i < high.length; i++) {
			System.out.println(high[i]);
		}
		int[] age = {47, 45, 18, 14};
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
			
		}
		String[] name = {"정병학", "최정혜", "정지훈", "정도훈"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
			
		}
		char[] gen = {'남', '여', '남', '남'};
		for (int i = 0; i < gen.length; i++) {
			System.out.println(gen[i]);
			
		}
		boolean[] food = {true, true, true, false};
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
			
		}
	}

}
