package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// +, -, /, %, *, &&, ||, ! 등 : 기호(연산자)
		int x = 200;
		int y = 100;
		int sum = x + y; //300
		//int끼리의 계산은 무조건 int
		System.out.println(x + y);
		int point = 500;
		System.out.println(sum + point);
		
		int minus = x - y;
		int mul = x * y;//곱하기
		int div = x / y;//나누기
		int odd = x % y;//나머지
		//한줄 복사 : ctrl + alt + 화살표 아래
		//한줄 이동 : alt + 화살표 방향
		System.out.println("x + y는 " + sum);
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(div);
		System.out.println(odd);
	}

}
