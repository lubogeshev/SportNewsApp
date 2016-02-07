package News;

public class TopNews extends News {

	private static TopNews uniqueInstance;

	private TopNews(String text, Category category) {
		super(text, category);
		// this.getTitle() BIGGER FONT
		// this.getImage() BIGGER PIC
	}

	private TopNews(String title, String text, Category category) {
		super(title, text, category);
		// this.getTitle() BIGGER FONT
		// this.getImage() BIGGER PIC
	}

	public static TopNews createTopNews(String title, String text, Category category) {
		if (uniqueInstance == null) {
			if (title == null) {
				uniqueInstance = new TopNews(text, category);
			} else {
				uniqueInstance = new TopNews(title, text, category);
			}
		}
		return uniqueInstance;
	}

}
