package Demo;

import News.TopNews;

public class Demo {

	public static void main(String[] args) {
	
		TopNews news = TopNews.getTopNews();
		news.printNews();
		
		
	}
	
}
