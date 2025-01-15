package com.vti.service;

import java.util.List;
import com.vti.entity.News;
import com.vti.form.NewsFormCreate;

public interface INewsService {

	public List<News> getAllNewss();

	public News getNewsByID(int id);

	public void createNews(NewsFormCreate from);

	public void updateNews(News news);

	public void deleteNews(int id);

	public boolean isNewsExistsByID(int id);
	
}
