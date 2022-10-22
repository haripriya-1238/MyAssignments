package week3.day2;

public class Automation extends MultipleLangauge {
	public static void main(String[] args) {
		MultipleLangauge lang = new MultipleLangauge();
		lang.java("java lang");
		lang.javaScript("script lang");
		lang.ruby("ruby lang");
		lang.selenium("Tool");
		System.out.println("----------------------------");
		

		Language langs = new MultipleLangauge();
		langs.java("java lang");
		langs.ruby("ruby lang");
		langs.javaScript("script lang");
		System.out.println("----------------------------");
		
		
		TestTool tol = new MultipleLangauge();
		tol.selenium("Tool");
		
}
}