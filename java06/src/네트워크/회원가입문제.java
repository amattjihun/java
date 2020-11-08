package 네트워크;

public class 회원가입문제 {

	public static void main(String[] args) {
		System.out.println("id" + "\t" +  "pw" + "\t" + "name" + "\t" + "tel" + "\n"
				+ "---------------------------------");
		회원 root = new 회원("root", "1234", "park", "011");
		System.out.println(root);
		
		회원 admin = new 회원("apple", "1111", "kim", "012");
		System.out.println(admin);
		
		회원 apple = new 회원(); //메서드
		apple.id = "apple";
		apple.pw = "2222";
		apple.name = "song";
		apple.tel = "013";
		System.out.println(apple);
		
		회원 melon = new 회원();
		melon.id = "melon";
		melon.pw = "3333";
		melon.name = "jung";
		melon.tel = "014";
		System.out.println(melon);
		
	}

}
