package 클래스활용;

public class 발사이즈 {

	public static void main(String[] args) {
		int 남자수 = 6;
		int 여자수 = 4;
		
		int 남자평균발사이즈 = 1200;
		int 여자평균발사이즈 = 600;
		
		사이즈계산 cal = new 사이즈계산();
		double 남자평균 = cal.평균구하기(남자평균발사이즈, 남자수);
		System.out.println(cal.평균구하기(남자평균발사이즈, 남자수));
		double 여자평균 = cal.평균구하기(여자평균발사이즈, 여자수);
		System.out.println("남자평균 " + 남자평균);
		System.out.println("여자평균 " + 여자평균);
		
	}

}
