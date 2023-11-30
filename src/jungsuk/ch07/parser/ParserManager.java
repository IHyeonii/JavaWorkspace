package jungsuk.ch07.parser;

import java.sql.Connection;

public class ParserManager {
	// 리턴타입이 인터페이스
	public static Parseble getParse(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseble p = new HTMLParser();
//			return p;
			return new HTMLParser();
		}
	}
	
	public static void main(String[] args) {
		Parseble parser = ParserManager.getParse("XML");
		parser.parse("document.xml");
		
		parser = ParserManager.getParse("HTML");
		parser.parse("document.html");
		
		Connection conn = null;
	}
}
