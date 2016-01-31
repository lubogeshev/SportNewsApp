package News;

public class TopNews extends News {

	private static TopNews uniqueInstance;

	private TopNews() {

	}

	private TopNews(String text) {
		super(text);
		// this.getTitle() BIGGER FONT
		// this.getText() BIGGER FONT
	}

	private TopNews(String title, String text) {
		super(title, text);
		// this.getTitle() BIGGER FONT
		// this.getText() BIGGER FONT
	}

	public static TopNews getTopNews() {
		if (uniqueInstance == null)
			uniqueInstance = new TopNews();
		return uniqueInstance;
	}

	public static void setTopNews(News latest) {
		TopNews.uniqueInstance = (TopNews) latest;
	}

}
