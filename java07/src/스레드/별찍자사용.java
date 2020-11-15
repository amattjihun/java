package 스레드;

public class 별찍자사용 {

	public static void main(String[] args) {
		별찍자 s1 = new 별찍자();
		별찍자2 s2 = new 별찍자2();
		s1.start();
		s2.start();
	}

}
