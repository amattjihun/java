package ũ�Ѹ�;

import java.io.FileWriter;
import java.io.IOException;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹����� {

	public void open(String code) throws Exception {
		//public static connection connect(String url)
		//��Ʈ���� ����
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code);
		System.out.println("���� ����.");
		Document doc = con.get();//�����ҽ��� ��� �ٿ�ε�
		String �ڵ� = doc.select("span.code").get(0).text();

		
		Elements list = doc.select("td.first span.blind");
		String ���� = list.get(0).text();
		String �ð� = list.get(0).text();
		
		Elements list2 = doc.select("div.today span.blind");
		String ���� = list2.get(0).text();
		System.out.println("�ڵ� > " + �ڵ�);
		System.out.println("���� > " + ����);
		System.out.println("�ð� > " + �ð�);
		System.out.println("���� > " + ����);
		
		FileWriter file = new FileWriter(�ڵ�);
		file.write(�ڵ� + "\n");
		file.write(���� + "\n");
		file.write(�ð� + "\n");
		file.write(���� + "\n");
		file.close();
		
	}

}
