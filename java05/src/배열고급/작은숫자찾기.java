package 배열고급;

public class 작은숫자찾기 {

	public static void main(String[] args) {
		int[] n = {33, 66, 11, 44, 88};
		int min = n[0]; //33
		for (int i = 1; i < n.length; i++) {
			if (min > n[i]) {//33 < 66: 33 -> 33 > 11: 11 -> ... -> 11 = min
				min = n[i];
			}
		}
		System.out.println(min);
	}

}
