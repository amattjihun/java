package 크롤링;

import java.io.FileWriter;
import java.io.IOException;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버접속 {

	public void open(String code) throws Exception {
		//public static connection connect(String url)
		//스트림을 만듬
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code);
		System.out.println("접속 성공.");
		Document doc = con.get();//문서소스를 모두 다운로드
		String 코드 = doc.select("span.code").get(0).text();

		
		Elements list = doc.select("td.first span.blind");
		String 전일 = list.get(0).text();
		String 시가 = list.get(0).text();
		
		Elements list2 = doc.select("div.today span.blind");
		String 마감 = list2.get(0).text();
		System.out.println("코드 > " + 코드);
		System.out.println("전일 > " + 전일);
		System.out.println("시가 > " + 시가);
		System.out.println("마감 > " + 마감);
		
		FileWriter file = new FileWriter(코드);
		file.write(코드 + "\n");
		file.write(전일 + "\n");
		file.write(시가 + "\n");
		file.write(마감 + "\n");
		file.close();
		
	}

}
