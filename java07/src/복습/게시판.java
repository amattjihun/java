package 복습;

public class 게시판 {
	//상태=>변수-> 전체영역(글로벌변수)
	//자동초기화(int=0), 참조형->null:주소가 없다.)
	public String title; //선언 위치가 중요
	public String content;
	public String writer = null;
	
	//동작(기능정의)=>멤버 메서드
	public void 글쓰기() {
		System.out.println("글쓰기 시작");
	}
	
	public void 글삭제() {
		System.out.println("글삭제 시작");
	}
	//클래스와 똑같은 이름을 가진 클래스가 하나도 없는 경우는
	//자동으로 만들어줌.
	public 게시판() {
		
	}
	
	public 게시판(String t, String c, String w) {
		title = t;
		content = c;
		writer = w;
		
	}
	//원래 있었던 기능을 재정의함(오버라이딩)
	public String toString() {
		return "제목: " + title + "\n"
				+ "내용: " + content + "\n"
				+ "작성자: " + writer;
	}

}
