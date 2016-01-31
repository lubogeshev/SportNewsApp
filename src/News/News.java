package News;

import java.time.LocalDateTime;
import java.util.List;

import Comments.Comment;

public abstract class News {

	protected static final int TITLE_LENGTH = 20;
	protected String title;
	protected String text;
	protected List <Comment> comments;
	
	// image
	
	private final LocalDateTime releasedOn = LocalDateTime.now();

	public News() {
		
	}
	
	public News(String text) {
		setText(text);
		if (TITLE_LENGTH > text.length()) {
			this.title = this.text;
		} else {
			this.title = this.text.substring(0, TITLE_LENGTH) + "...";
		}
	}

	public News(String title, String text) {
		setText(text);
		setTitle(title);		
	}

	// public News(String title, String text, IMAGE) {

	public void printNews(){
		System.out.println(this.getTitle() + "\n" + this.getText() + "\n" + this.releasedOn);
	}
	
	// Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title == null) {
			this.title = "----Empty Title----";
		} else {
			this.title = title;
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		if (text == null) {
			this.text = "----Empty Text----";
		} else {
			this.text = text;
		}
	}

}
