package Demo;

import Comments.Comment;
import News.TopNews;

public class Demo {

	public static void main(String[] args) {
	
		TopNews news = TopNews.getTopNews();
		news.printNews();
		Comment comment = new Comment("","");
		
		System.out.println(comment.getCommentedOn());
		
	}
	
}
