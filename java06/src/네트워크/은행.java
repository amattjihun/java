package 네트워크;

public class 은행 {

	public static void main(String[] args) {
		계좌 dad = new 계좌();
		dad.name = "아빠";
		dad.field = "예금";
		dad.price = 1000;
		dad.입금();
		System.out.println(dad);
		
		계좌 mom = new 계좌();
		mom.name = "엄마";
		mom.field = "적금";
		mom.price = 2000;
		System.out.println(mom);
		
		계좌 d = new 계좌();
		d.name = "딸";
		d.field = "출금";
		d.price = 3000;
		d.출금();
		System.out.println(d);
//		System.out.println(d.name);
//		System.out.println(d.field);
//		System.out.println(d.price);
	}

}
