package Comments;

import java.time.LocalDateTime;

public class Comment {

	private String author;
	private String text;
	private final LocalDateTime commentedOn = LocalDateTime.now().withNano(0);
	
	public Comment(String author, String text) {
		this.author = author;
		this.text = text;
	}

	public LocalDateTime getCommentedOn() {
		return commentedOn;
	}

	public String getAuthor() {
		return author;
	}

	public String getText() {
		return text;
	}	
	
}
