package 예외처리;

public class 예외처리1 {

	public static void main(String[] args) {
		System.out.println("여기에서 출발");
		try {
			String[] name = {"홍길동", "정길동"};
			name[2] = "홍길동";			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("에러가 발생하든/발생하지 않든 무조건 실행");
			System.out.println("파일의 close()샐행!!");
		}
		
		System.out.println("실행이 될까?");
		
	}

}
