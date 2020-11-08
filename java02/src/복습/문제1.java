package 복습;

public class 문제1 {

	public static void main(String[] args) {
		int 체육 = 66, 수학 = 77, 영어 = 88, 국어 = 99;
		int sum = 체육 + 수학 + 영어 + 국어;
		double avg = (double)sum / 4;
		System.out.println("합계는 " + sum);
		System.out.println("평균은 " + avg);
		
		
		final double pi = 3.14; //바꿀 수 없는 값 지정
		//항상 똑같은 값 : 상수 (final)
		double myR = 2.2; ///카멜표기법(myR)
		System.out.println(pi * myR * myR);
		
	}

}
