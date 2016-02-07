package News;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Comments.Comment;

public abstract class News {

	private static final int TITLE_LENGTH = 20;
	private String title;
	private StringBuilder text;
	private List<Comment> comments = new ArrayList<>();
	private Category category;
	private final LocalDateTime releasedOn = LocalDateTime.now().withNano(0);
	// image

	public enum Category {
		FOOTBALL, BASKETBALL, VOLLEYBALL, TENNIS, SNOOKER, MOTOR, OTHER;

	}

	public News(String text, Category category) {
		setText(text);
		if (TITLE_LENGTH > text.length()) {
			this.title = this.text.toString();
		} else {
			this.title = this.text.substring(0, TITLE_LENGTH) + "...";
		}
		if (category == null) {
			this.category = Category.OTHER;
		}
	}

	public News(String title, String text, Category category) {
		setText(text);
		setTitle(title);
		this.category = category;
	}

	// public News(String title, String text, Category category IMAGE) {
	
	public String showNews() {
		return this.getTitle() + "\n" + this.getText() + "\n" + this.category.name() + "\n" + this.releasedOn;
	}

	public void addComment(Comment comment) {
		this.comments.add(comment);
	}

	// Getters and Setters
	public String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		if (title == null) {
			this.title = "----Empty Title----";
		} else {
			this.title = title;
		}
	}

	public StringBuilder getText() {
		return text;
	}

	private void setText(String text) {
		if (text == null) {
			this.text = new StringBuilder("----Empty Text----");
		} else {
			this.text = new StringBuilder(text);
		}
	}

	public Category getCategory() {
		return category;
	}

}
