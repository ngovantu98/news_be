package com.vti.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vti.entity.News;
import com.vti.form.NewsFormCreate;
import com.vti.repository.INewsRepository;

@Service
public class NewsService implements INewsService {

	@Autowired
	private INewsRepository repository;

	public List<News> getAllNewss() {
		return repository.findAll();
	}

	public News getNewsByID(int id) {
		return repository.findById(id).get();
	}

	public void createNews(NewsFormCreate from) {
		repository.save(from.toEntity());
	}

	public void updateNews(News news) {
		repository.save(news);
	}

	public void deleteNews(int id) {
		repository.deleteById(id);
	}

	public boolean isNewsExistsByID(int id) {
		return repository.existsById(id);
	}

}
