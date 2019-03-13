package study_190313;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// https://news.naver.com/main/read.nhn?sid1=100&oid=001&aid=0000000001


class Utils {

	public static String numberring(String aid) {
	
		// 1. aid를 숫자로 바꾸고
		// 2. 1증가시키고
		// 3. 0을 붙여준다
		int temp = Integer.parseInt(aid);
		temp++;
		aid = String.format("%010d", temp);
		return aid;
		
	}
}


class News {

	private String address;
	private String title;
	private String creadtedDate;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreadtedDate() {
		return creadtedDate;
	}
	public void setCreadtedDate(String creadtedDate) {
		this.creadtedDate = creadtedDate;
	}
	
}


class Crawling {
	
	ArrayList<News> array = new ArrayList<>();
	
	
	// 네이버 뉴스를 다운로드 할 수 있는 함수
	public void download(String address) {
		
		StringBuilder html = new StringBuilder();
		
		try {

			URL url = new URL(address);

			URLConnection con = url.openConnection();

			BufferedReader download = new BufferedReader
					(new InputStreamReader(con.getInputStream(), "EUC-KR"));

			while(true) {
				String line = download.readLine();
				if(line == null) break;
				html.append(line);
			}
			
			download.close();
			
			System.out.println("download end");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// html 내용을 파싱해서 articleTitle(id)를 찾아야 함
		Document doc = Jsoup.parse(html.toString());
		
		// # : id로 찾음, 스트링으로 가져옴
		// Elements는 내부적으로 Element를 가지고 있음
		Elements articleTitle = doc.select("#articleTitle");
		Elements createDate = doc.select(".t11");
		Element title = null;
		Element date = null;
		
		try {
			title = articleTitle.get(0);
			date = createDate.get(0);
			
			News news = new News();
			news.setAddress(address);
			news.setTitle(title.text());
			news.setCreadtedDate(date.text());
			
			array.add(news);
			
		} catch (Exception e) {
			System.out.println("Title NotFound");
		}
		
		// . : class로 찾음, 배열로 가져옴
		doc.select(".tts+head");

//		try {
//			String index = html.substring(html.indexOf("articleTitle"));
//			String findex = index.substring(index.indexOf("\">"), index.indexOf("</h3")).replace("\">", "");
//			
//			System.out.println(findex);
//
//		} catch (Exception e) {
//			System.out.println("Title NotFound");
//		}

	}
	
}


public class NewsApp {

	public static void main(String[] args) {
		
		Crawling craw = new Crawling();
		String aid = "0000000001";
		
		int count = 0;
		
		while(true) {
			String address =
					"https://news.naver.com/main/read.nhn?sid1=100&oid=001&aid=" + aid;
			craw.download(address);
			aid = Utils.numberring(aid);
			
			count++;
			
			if(count == 100) break;

		}
		
		int size = craw.array.size();
		
		System.out.println();
		
		for(int i = 0; i < size; i++) {
			System.out.println(craw.array.get(i).getTitle());
			System.out.println(craw.array.get(i).getAddress());
			System.out.println(craw.array.get(i).getCreadtedDate());
			System.out.println();
		}
		
	}

}

