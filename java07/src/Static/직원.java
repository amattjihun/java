package Static;

public class ���� {
	String name;
	String gender;
	int age;
	
	static int count;
	static int sum;

	public ����(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		count++;
		sum = sum + age;
	}
	
	//��� ���ϴ� ����� ����(�޼���)
	//��ü�������� �ʾƵ� Ŭ�����̸����� �ٷ� �����ؼ� ����� �� �ִ� �޼���
	//static �޼���
	public static int getAvg() {
		return sum / count;
	}

	public String toString() {
		return "���� [name=" + name + ", gender=" + gender + ", age=" + age + "]";
		
	}
	
	
	
	

}
