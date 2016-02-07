package Administrator;

import java.util.ArrayList;
import java.util.List;

import News.News;
import News.TopNews;
import News.News.Category;

public abstract class NewsManager {

	private List<News> allNews = new ArrayList<News>();
	private static List<Admin> admins = new ArrayList<Admin>();
	private TopNews top;

	public void addNews(News news) {
		this.allNews.add(news);
	}

	public void addAsTop(News top) {
		if (this.top != null) {
			addNews(this.top);
		}
		this.top = (TopNews) top;
	}

	public void addMoreText(News news, String text) {
		news.getText().append(text);
	}

	public void deleteNews(News news) {
		this.allNews.remove(news);
	}
	
	public void getNewsCategorizedAs (Category category) {
		for (News news : allNews) {
			if (news.getCategory() == category) {
				news.showNews();
			}
		}
	}

	public static List<Admin> getAdmins() {
		return admins;
	}

	public List<News> getAllNews() {
		return allNews;
	}

	public TopNews getTop() {
		return top;
	}

}
