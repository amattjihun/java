package ��Ʈ��ũ;

public class ȸ�����Թ��� {

	public static void main(String[] args) {
		System.out.println("id" + "\t" +  "pw" + "\t" + "name" + "\t" + "tel" + "\n"
				+ "---------------------------------");
		ȸ�� root = new ȸ��("root", "1234", "park", "011");
		System.out.println(root);
		
		ȸ�� admin = new ȸ��("apple", "1111", "kim", "012");
		System.out.println(admin);
		
		ȸ�� apple = new ȸ��(); //�޼���
		apple.id = "apple";
		apple.pw = "2222";
		apple.name = "song";
		apple.tel = "013";
		System.out.println(apple);
		
		ȸ�� melon = new ȸ��();
		melon.id = "melon";
		melon.pw = "3333";
		melon.name = "jung";
		melon.tel = "014";
		System.out.println(melon);
		
	}

}
